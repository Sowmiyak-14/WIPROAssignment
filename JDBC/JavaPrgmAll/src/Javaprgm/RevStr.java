package Javaprgm;

import java.util.Scanner;

public class RevStr {

	/*public static void reverseWithStringBuilder(String[] args) {
        String str="automonus";
        StringBuilder sb = new StringBuilder(str).reverse();
       // String  reverse=sb.reverse().toString();
         System.out.println(sb);
	}*/
	
	 public static String reverseWithStringBuilder(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	 }
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();
	        System.out.println("Reversed using StringBuilder: " + reverseWithStringBuilder(input));

	        scanner.close();
	    }
}
