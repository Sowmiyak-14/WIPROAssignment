package Wipro_IO;
import java.io.*;
class Student implements Serializable {
 String name;
 int age;

 Student(String name, int age) {
     this.name = name;
     this.age = age;
 }
}
public class SerializeDeserializeExample {
 public static void main(String[] args) {
     String filename = "student.ser";
     // ----- Serialization -----
     try {
         Student s1 = new Student("Sowmiya", 22);
         FileOutputStream fileOut = new FileOutputStream(filename);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);

         out.writeObject(s1);
         out.close();
         fileOut.close();

         System.out.println("✅ Object serialized to " + filename);
     } catch (IOException e) {
         e.printStackTrace();
     }
     // ----- Deserialization -----
     try {
         FileInputStream fileIn = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         Student s2 = (Student) in.readObject();
         in.close();
         fileIn.close();
         System.out.println("✅ Object deserialized:");
         System.out.println("Name: " + s2.name);
         System.out.println("Age: " + s2.age);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
