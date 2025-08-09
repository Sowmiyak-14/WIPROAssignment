package Wipro_Oops_concepts;
 class Vehicle1 {
    public int speed() {
        return 0;
    }
}
class Logan extends Vehicle1 {
    @Override
    public int speed() {
        return 120;
    }
    public int gps() {
        System.out.println("Logan: GPS is active.");
        return 1;
    }
}
class Ford extends Vehicle1 {
    @Override
    public int speed() {
        return 150;
    }
    public int tempControl() {
        System.out.println("Ford: Temperature control is ON.");
        return 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Logan logan = new Logan();
        Ford ford = new Ford();
        System.out.println("Logan Speed: " + logan.speed());
        logan.gps();
        System.out.println("Ford Speed: " + ford.speed());
        ford.tempControl();
    }
}

