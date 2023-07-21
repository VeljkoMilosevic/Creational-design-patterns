package desing.patterns.patterns.singleton.singletons;

public class DoubleCheckLockSingleton {

    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }

    public void method() {
        System.out.println("Double-check lock singleton method!");
    }
}
