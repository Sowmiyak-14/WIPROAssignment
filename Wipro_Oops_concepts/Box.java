package Wipro_Oops_concepts;
class Box {
 double width;
 double height;
 double depth;
 Box(double w, double h, double d) {
     width = w;
     height = h;
     depth = d;
 }
 double volume() {
     return width * height * depth;
 }
 public static void main(String[] args) {
     Box b = new Box(2, 3, 4); 
     System.out.println("Volume = " + b.volume()); 
 }
}
