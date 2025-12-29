package singleton.dcl;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("私は，二重チェックロッキングを利用したSingletonです!");
    }
}