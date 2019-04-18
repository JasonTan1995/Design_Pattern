package singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton() {}

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
