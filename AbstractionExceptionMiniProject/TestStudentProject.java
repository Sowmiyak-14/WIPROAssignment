package AbstractionExceptionMiniProject;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.*;

public class TestStudentProject {
    public static void main(String[] args) {
        Student[] students = new Student[6];

        // TC1: A+ grade student (marks >= 250)
        students[0] = new Student("A+", new int[]{90, 90, 90}, "Alice");

        // TC2: F grade student (one mark < 35)
        students[1] = new Student("F", new int[]{90, 34, 80}, "Bob");

        // TC3: Null student object
        students[2] = null;

        // TC4: Null name
        students[3] = new Student("B", new int[]{60, 60, 60}, null);

        // TC5: Null marks array
        students[4] = new Student("C", null, "David");

        // Valid student for extra testing
        students[5] = new Student("B", new int[]{50, 50, 50}, "Eva");

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        System.out.println("----- Grade Calculation Tests -----");
        for (Student s : students) {
            try {
                if (report.validate(s).equals("VALID")) {
                    String grade = report.findGrades(s);
                    System.out.println("Student: " + s.getName() + ", Grade: " + grade);
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }

        System.out.println("\n----- Counting Null Entries -----");
        System.out.println("TC6 - Null Names Count: " + service.findNumberOfNullNames(students));
        System.out.println("TC7 - Null Objects Count: " + service.findNumberOfNullObjects(students));
        System.out.println("TC8 - Null Marks Array Count: " + service.findNumberOfNullMarksArray(students));
    }
}
