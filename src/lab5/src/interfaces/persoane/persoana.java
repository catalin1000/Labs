package interfaces.persoane;

public interface persoana {
    int worked_years = 4;

    default void getName(){
        System.out.println("Numele meu este... !");
    }
    default void printNoOfWorkedYears() {
        System.out.println("I have worked " + worked_years + " years");
    }

    static void makeNoise() {
        System.out.println("I can make noises!");
    }
}
