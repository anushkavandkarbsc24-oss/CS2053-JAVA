import java.util.Scanner;

class Employee {
    String name, id, department, role;
    double salary;

    Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void updateDetails(String role, double salary) {
        this.role = role;
        this.salary = salary;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Department : " + department);
        System.out.println("Role       : " + role);
        System.out.println("Salary     : " + salary);
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Employee emp = new Employee(name, id, dept);

        if (args.length < 2) {
            System.out.println("Please provide role and salary as command-line arguments.");
            return;
        }

        String role = args[0];
        double salary = Double.parseDouble(args[1]);

        emp.updateDetails(role, salary);
        emp.display();
    }
}
