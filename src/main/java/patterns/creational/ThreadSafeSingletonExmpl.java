package patterns.creational;

public class ThreadSafeSingletonExmpl {

    /**
     * Lazy intii
     */
    private static ThreadSafeSingletonExmpl INSTANCE;

    private ThreadSafeSingletonExmpl() {

    }

    /**
     * making the singleton thread safe but will sacrifice performance for the hefty synchronized method
     * @return ThreadSafeSingletonExmpl
     */
    public static synchronized ThreadSafeSingletonExmpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingletonExmpl();
        }

        return INSTANCE;
    }
}
