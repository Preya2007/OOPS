import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {

       System.out.println("Enrollment No. 240390107032");
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        // Display all marks
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Find highest and lowest marks
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        // Display results
        System.out.println("\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}