import org.junit.Assert;
import org.junit.Test;
import singleton.EnumSingleton;
import singleton.SerSingleton;
import singleton.StaticSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {
        SerSingleton s = null;
        SerSingleton s1 = SerSingleton.getInstance();

        FileOutputStream fos = new FileOutputStream("Singleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("Singleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s = (SerSingleton) ois.readObject();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s == s1);
    }

    @Test
    public void test() throws Exception {

        EnumSingleton s = null;
        EnumSingleton s1 = EnumSingleton.instance;

        // SerSingleton s = null;
        //SerSingleton s1 = SerSingleton.getInstance();

        FileOutputStream fos = new FileOutputStream("SerSingleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("SerSingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s = (EnumSingleton) ois.readObject();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s == s1);
        Assert.assertEquals(s, s1);
    }

    @Test
    public void lazyTest() {
        StaticSingleton instance = StaticSingleton.getInstance();
        StaticSingleton instance1 = StaticSingleton.getInstance();
        System.out.println(instance == instance1);
    }

    @Test
    public void reflectSingleton() throws Exception {
        Class aClass = Class.forName("singleton.StaticSingleton");
        Constructor declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        StaticSingleton ton = (StaticSingleton) declaredConstructor.newInstance();
        StaticSingleton instance = StaticSingleton.getInstance();
        System.out.println(ton == instance);
    }
}

