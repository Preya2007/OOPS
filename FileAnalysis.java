import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
	System.out.println("Enrollment No. 240390107032");
        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                charCount += line.replaceAll("\\s+", "").length();
            }

            // Display results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newline): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        } finally {
            // Close BufferedReader
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}