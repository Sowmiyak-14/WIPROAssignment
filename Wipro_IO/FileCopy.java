package Wipro_IO;
import java.io.*;
import java.util.Scanner;
public class FileCopy {
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

            System.out.println("Enter the input file name:");
            String inputFile = sc.nextLine();

            System.out.println("Enter the output file name:");
            String outputFile = sc.nextLine();

            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fis.close();
            fos.close();
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
