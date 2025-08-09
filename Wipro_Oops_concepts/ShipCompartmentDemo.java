package Wipro_Oops_concepts;
public class ShipCompartmentDemo {

    static class Compartment {
        private double height;
        private double width;
        private double breadth;

        public Compartment(double height, double width, double breadth) {
            this.height = height;
            this.width = width;
            this.breadth = breadth;
        }

        public void display() {
            System.out.println("Ship Compartment Details:");
            System.out.println("Height: " + height);
            System.out.println("Width: " + width);
            System.out.println("Breadth: " + breadth);
        }
    }

    public static void main(String[] args) {
        Compartment shipCompartment = new Compartment(12.5, 8.0, 5.5);
        shipCompartment.display();
    }
}
