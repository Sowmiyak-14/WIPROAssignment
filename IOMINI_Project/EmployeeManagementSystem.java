package IOMINI_Project;
import java.io.*;
import java.util.*;
public class EmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static String fileName = "employees.txt";
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.println("Exiting the System...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    public static void addEmployee() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            bw.write(id + " " + name + " " + age + " " + salary);
            bw.newLine();
            System.out.println("Employee added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
    public static void displayAll() {
        System.out.println("===== Report =====");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("===== End of Report =====");
        } catch (IOException e) {
            System.out.println("No records found.");
        }
    }
}
