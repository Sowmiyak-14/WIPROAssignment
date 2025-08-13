package Wipro_IO;
import java.io.*;
import java.util.Scanner;
public class FileCountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File sampleFile = new File("Input.txt");
            if (!sampleFile.exists()) {
                try (PrintWriter pw = new PrintWriter(sampleFile)) {
                    pw.println("Roses are red,");
                    pw.println("Violets are blue,");
                    pw.println("Rivers are running,");
                    pw.println("Right under you.");
                    pw.println("Rain or shine,");
                    pw.println("Remember the view.");
                }
                System.out.println("Sample file 'Input.txt' created with test content.");
            }
            System.out.println("Enter the file name:");
            String fileName = sc.nextLine();

            System.out.println("Enter the character to be counted:");
            char ch = sc.nextLine().toLowerCase().charAt(0); // convert to lowercase

            FileReader fr = new FileReader(fileName);
            int count = 0;
            int c;

            while ((c = fr.read()) != -1) {
                if (Character.toLowerCase((char) c) == ch) {
                    count++;
                }
            }
            fr.close();
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
