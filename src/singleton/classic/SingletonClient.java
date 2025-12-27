package singleton.classic;

public class SingletonClient {
    public static void main(String[] args) {
        System.out.println(Singleton.judgeCreatingObject());
        Singleton.getInstance();
        System.out.println(Singleton.judgeCreatingObject());
    }
}