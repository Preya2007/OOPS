import java.io.*;

public class StudentFileExample {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // 1. Create and write to file
            fw = new FileWriter("students.txt");

            fw.write("101, Preya, 85\n");
            fw.write("102, Rahul, 90\n");
            fw.write("103, Anjali, 78\n");

            System.out.println("Student records written to file.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        } finally {
            // Close FileWriter
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing FileWriter.");
            }
        }

        try {
            // 2. Read from file
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Reading student records:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } finally {
            // Close BufferedReader
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }
    }
}