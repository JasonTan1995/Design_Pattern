package singleton;

/**
 * 懒汉式-线程安全
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null)
           instance = new LazySingleton();
        return instance;
    }
}
