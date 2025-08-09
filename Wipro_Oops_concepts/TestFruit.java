package Wipro_Oops_concepts;
class Fruit {
 public void eat() {
     System.out.println("This is a fruit.");
 }
}
class Apple extends Fruit {
 @Override
 public void eat() {
     System.out.println("Apple is sweet and crunchy.");
 }
}
class Orange extends Fruit {
 @Override
 public void eat() {
     System.out.println("Orange is juicy and tangy.");
 }
}
public class TestFruit {
 public static void main(String[] args) {
     Apple a = new Apple();
     Orange o = new Orange();

     a.eat();
     o.eat();
 }
}

