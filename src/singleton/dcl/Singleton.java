package singleton.dcl;

public class Singleton {
    /**
     * This implementation is danger!
     * This is because this singleton isn't guaranteed to work prior to Java 5.
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}