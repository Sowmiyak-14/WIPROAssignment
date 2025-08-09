package ExceptionHandling;
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class PersonInfo {
 public static void main(String[] args) throws NumberFormatException {
     try {
         if (args.length != 2) {
             throw new IllegalArgumentException("Please provide exactly 2 arguments: name and age.");
         }

         String name = args[0];
         int age;

         try {
             age = Integer.parseInt(args[1]);
         } catch (NumberFormatException e) {
             throw new NumberFormatException("Age must be a valid number.");
         }

         if (age <= 18 || age >= 60) {
             throw new InvalidAgeException("Age must be greater than 18 and less than 60.");
         }

         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Valid input. Program executed successfully.");

     } catch (InvalidAgeException | IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
         System.out.println("Program exited due to invalid input.");
     }
 }
}
