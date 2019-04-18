package singleton;

public class StaticSingleton {

    private StaticSingleton(){
        System.out.println("StaticSingleton has been created");
        if (SingletonHolder.instance != null) {
            throw new RuntimeException("The instance is Singleton");
        }
    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
