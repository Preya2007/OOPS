class Employee {
    String name;
    String department;

    // Constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;
    String projectName;

    // Constructor
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

// Main Class
class EmployeeDemo {
    public static void main(String[] args) {

        // Object of Employee
        Employee e = new Employee("Preya", "HR");
        System.out.println("\n--- Employee Details ---");
        e.displayDetails();

        // Object of Manager (Upcasting)
        Employee m = new Manager("Rahul", "IT", 10, "AI Project");
        System.out.println("\n--- Manager Details ---");
        m.displayDetails();
    }
}