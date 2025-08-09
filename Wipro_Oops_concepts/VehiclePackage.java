package Wipro_Oops_concepts;
abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}
class Hero extends Vehicle {
    public String getModelName() {
        return "Hero Splendor Plus";
    }
    public String getRegistrationNumber() {
        return "TN-22-1234";
    }
    public String getOwnerName() {
        return "Sherya K";
    }
    public int getSpeed() {
        return 85; 
    }
    public void radio() {
        System.out.println("Radio is playing now.");
    }
}
class Honda extends Vehicle {
    public String getModelName() {
        return "Honda City";
    }
    public String getRegistrationNumber() {
        return "TN-22-5678";
    }
    public String getOwnerName() {
        return "Sowmiya K";
    }
    public int getSpeed() {
        return 120;
    }
    public void cdplayer() {
        System.out.println("CD Player is playing music.");
    }
}
public class VehiclePackage {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero Bike Model: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();
        System.out.println();
        Honda honda = new Honda();
        System.out.println("Honda Car Model: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdplayer();
    }
}
