import java.util.Scanner;

class College {

    // Data member of outer class
    String collegeName;

    // Constructor to initialize college name
    College(String name) {
        collegeName = name;
    }

    // Non-static inner class
    class Admission {

        String studentName;
        String course;

        Scanner sc = new Scanner(System.in);

        // Method to accept student details
        void acceptDetails() {
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }

        // Method to display admission details
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object of outer class
        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();

        College college = new College(cname);

        // Creating object of inner class
        College.Admission admission = college.new Admission();

        // Calling methods
        admission.acceptDetails();
        admission.displayDetails();
    }
}