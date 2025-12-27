package singleton.classic;

public class Singleton {
    // NOTE: This class is not thread safe!
    private static Singleton uniqueInstance;

    // constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static String judgeCreatingObject() {
        if (uniqueInstance == null) {
            return "You have to create me.";
        } else {
            return "I've already created.";
        }
    }
}