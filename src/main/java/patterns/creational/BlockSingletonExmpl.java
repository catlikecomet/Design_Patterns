package patterns.creational;

public class BlockSingletonExmpl {

    private static BlockSingletonExmpl INSTANCE;

    static {
        try {
            INSTANCE = new BlockSingletonExmpl();
        } catch(Exception ex) {
            System.out.println("exception caught when instantiating block singleton example");
        }
    }

    private BlockSingletonExmpl(){}

    public BlockSingletonExmpl getInstance() {
        return INSTANCE;
    }

}
