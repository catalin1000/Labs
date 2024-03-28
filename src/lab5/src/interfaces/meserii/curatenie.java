package interfaces.meserii;

public interface curatenie extends meserie{
    @Override
    default void lucreaza() {
        System.out.println("Curat podele!");
    }
}
