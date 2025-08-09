package Wipro_Oops_concepts;
public class TestEmployee {
    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
    static class Employee extends Person {
        double salary;
        int year;
        String id;
        Employee(String name, double salary, int year, String id) {
            super(name);
            this.salary = salary;
            this.year = year;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000.0, 2020, "NI12345");

        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Year Started: " + emp.year);
        System.out.println("ID: " + emp.id);
    }
}
