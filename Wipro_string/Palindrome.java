package Wipro_string;
//public class Palindrome {
// public static void main(String[] args) {
//	 String str = "madam";
//	 System.out.println(isPalindrome(str));
// }
// static boolean isPalindrome(String str) {
//	 int start = 0;
//	 int end = str.length()-1;
//	 while(start < end) {
//		 if(str.charAt(start) != str.charAt(end)) {
//			 return false;
//		 }
//		 start++;
//		 end--;
//	 }
//	 return true;
// }
//}
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

