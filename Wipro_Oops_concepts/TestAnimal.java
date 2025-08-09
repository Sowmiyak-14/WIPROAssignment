package Wipro_Oops_concepts;

class Animal {
 public void eat() {
     System.out.println("Animal is eating");
 }
 public void sleep() {
     System.out.println("Animal is sleeping");
 }
}

class Bird extends Animal {
 @Override
 public void eat() {
     System.out.println("Bird is pecking food");
 }
 @Override
 public void sleep() {
     System.out.println("Bird is sleeping in a nest");
 }
 public void fly() {
     System.out.println("Bird is flying");
 }
}
public class TestAnimal {
 public static void main(String[] args) {
     Animal a = new Animal();
     a.eat();
     a.sleep();
     System.out.println("------");
     Bird b = new Bird();
     b.eat();
     b.sleep();
     b.fly();
 }
}
