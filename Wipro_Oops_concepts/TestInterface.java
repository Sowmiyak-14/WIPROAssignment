package Wipro_Oops_concepts;
interface Playable {
 void play();
}
class Veena implements Playable {
 public void play() {
     System.out.println("Playing the Veena.");
 }
}
class Saxophone implements Playable {
 public void play() {
     System.out.println("Playing the Saxophone.");
 }
}
public class TestInterface {
 public static void main(String[] args) {
     Veena veena = new Veena();
     veena.play();
     Saxophone sax = new Saxophone();
     sax.play();
     Playable p1 = veena;
     Playable p2 = sax;
     p1.play(); 
     p2.play();
 }
}
