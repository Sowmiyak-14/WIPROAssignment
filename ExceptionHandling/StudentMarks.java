package ExceptionHandling;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter 3 subject marks:");
            int m1 = Integer.parseInt(sc.nextLine());
            int m2 = Integer.parseInt(sc.nextLine());
            int m3 = Integer.parseInt(sc.nextLine());

            if (m1 < 0 || m2 < 0 || m3 < 0)
                throw new Exception("Negative marks not allowed");
            if (m1 > 100 || m2 > 100 || m3 > 100)
                throw new Exception("Marks should be between 0 and 100");

            int avg = (m1 + m2 + m3) / 3;
            System.out.println("Average marks: " + avg);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
