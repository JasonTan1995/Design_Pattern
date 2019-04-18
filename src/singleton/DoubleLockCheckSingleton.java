package singleton;

public class DoubleLockCheckSingleton{

    private DoubleLockCheckSingleton(){
        System.out.println("Singleton has been created");
    }

    private static volatile DoubleLockCheckSingleton singleton = null;

    public static  DoubleLockCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleLockCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
