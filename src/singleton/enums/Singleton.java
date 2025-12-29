package singleton.enums;

public enum Singleton {
    UNIQUE_INSTANCE;

    // other useful fields here

    public String getDescription() {
        return "私は，スレッドセーフのSingletonです!";
    }
}