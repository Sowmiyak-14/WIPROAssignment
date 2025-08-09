package Wipro_Oops_concepts;
import java.util.Random;
abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment {
    public String notice() { return "First Class Compartment"; }
}
class Ladies extends Compartment {
    public String notice() { return "Ladies Compartment"; }
}
class General extends Compartment {
    public String notice() { return "General Compartment"; }
}
class Luggage extends Compartment {
    public String notice() { return "Luggage Compartment"; }
}
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int type = r.nextInt(4) + 1;
            if (type == 1) compartments[i] = new FirstClass();
            else if (type == 2) compartments[i] = new Ladies();
            else if (type == 3) compartments[i] = new General();
            else compartments[i] = new Luggage();
        }

        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }
    }
}


