class University {

    // Static variable
    static String universityName;

    // Static data member to count students
    static int totalStudents;

    // Static block (executed once when class is loaded)
    static {
        universityName = "Global Tech University";
        totalStudents = 0;
        System.out.println("Static Block Executed");
        System.out.println("University Name Initialized: " + universityName);
    }

    // Instance block (executed every time an object is created, before constructor)
    {
        System.out.println("Instance Block Executed - A student object is being created");
    }

    // Constructor
    University() {
        totalStudents++;
        System.out.println("Constructor Executed - Student Created");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        // Creating first object
        University u1 = new University();

        System.out.println();

        // Creating second object
        University u2 = new University();

        System.out.println();

        // Access static method
        System.out.println("Total Students: " + University.getTotalStudents());
    }
}