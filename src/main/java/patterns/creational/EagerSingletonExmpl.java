package patterns.creational;

/**
 * A Singleton ensures that there is only one instance of a class,
 * providing a point of global access
 */
public class EagerSingletonExmpl {

    /**
     * Eager initialisation whereby the instance of this class is created at the time of the class loading
     */
    private static final EagerSingletonExmpl INSTANCE = new EagerSingletonExmpl();

   private EagerSingletonExmpl() {
   }

   public static EagerSingletonExmpl getInstance() {
       return INSTANCE;
   }
}
