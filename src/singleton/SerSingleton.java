package singleton;

import java.io.Serializable;

public class SerSingleton implements Serializable {

    private SerSingleton(){
        System.out.println("Singleton is created");
    }

    private static SerSingleton instance = new SerSingleton();

    public static SerSingleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    private Object readResolve() {
        return instance;
    }
}
