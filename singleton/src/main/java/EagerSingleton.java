public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        // Do your init work here
    }
    public static  EagerSingleton getInstance() {
        return instance;
    }
}
