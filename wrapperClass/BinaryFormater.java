package wrapperClass;
import java.util.Scanner;
public class BinaryFormater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (1 to 255): ");
        int n = scanner.nextInt();
        if (n < 1 || n > 255) {
            System.out.println("Please enter a number between 1 and 255.");
            return;
        }
        String binaryString = String.format("%8s",Integer.toBinaryString(n)).replace(' ','0');
        System.out.println("Binary representation: "+ binaryString);
    }
}

