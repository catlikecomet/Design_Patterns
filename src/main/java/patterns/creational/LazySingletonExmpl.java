package patterns.creational;

public class LazySingletonExmpl {

    /**
     * Lazy intii
     */
    private static LazySingletonExmpl INSTANCE;

    private LazySingletonExmpl() {

    }

    public LazySingletonExmpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonExmpl();
        }

        return INSTANCE;
    }
}
