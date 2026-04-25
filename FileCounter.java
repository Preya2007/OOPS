import java.io.*;

public class FileCounter {
    public static void main(String[] args) {
        
        // Check if filename is provided
        if (args.length == 0) {
            System.out.println("Please provide a file name as command-line argument.");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (excluding newline)
                charCount += line.length();

                // Count words
                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            // Output results
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}