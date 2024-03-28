package interfaces.meserii;

public interface profesor extends meserie{
    @Override
    default void lucreaza() {
        System.out.println("Predau lectii copiilor!");
    }
}
