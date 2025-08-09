package Wipro_Oops_concepts;
class Calculator {
 static int powerInt(int num1, int num2) {
     return (int) Math.pow(num1, num2);
 }
 static double powerDouble(double num1, int num2) {
     return Math.pow(num1, num2);
 }
 public static void main(String[] args) {
     int result1 = powerInt(3, 2);
     double result2 = powerDouble(2.5, 3); 

     System.out.println("powerInt(3, 2) = " + result1);
     System.out.println("powerDouble(2.5, 3) = " + result2);
 }
}
