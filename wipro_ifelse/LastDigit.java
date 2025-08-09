package wipro_ifelse;
import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a % 10 == b % 10)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
