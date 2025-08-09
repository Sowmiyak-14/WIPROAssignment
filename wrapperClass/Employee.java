package wrapperClass;
class Employee implements Cloneable {
    int id; String name; double salary;
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(101, "Sowmiya", 50000);
        Employee emp2 = (Employee) emp1.clone();
        emp2.name = "Divya"; emp2.salary = 60000;
        System.out.println("Original Employee:"); emp1.display();
        System.out.println("Cloned Employee (Modified):"); emp2.display();
    }
}

