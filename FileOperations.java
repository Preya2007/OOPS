import java.io.*;
import java.util.Date;

public class FileOperations {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy: java FileOperations copy source.txt dest.txt");
            System.out.println("Delete: java FileOperations delete filename.txt");
            System.out.println("Rename: java FileOperations rename oldname.txt newname.txt");
            return;
        }

        String command = args[0];

        try {
            switch (command.toLowerCase()) {

                case "copy":
                    if (args.length != 3) {
                        System.out.println("Usage: copy source.txt dest.txt");
                        return;
                    }
                    copyFile(args[1], args[2]);
                    printFileProperties(new File(args[2]));
                    break;

                case "delete":
                    File fileToDelete = new File(args[1]);
                    if (fileToDelete.delete()) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Failed to delete file.");
                    }
                    break;

                case "rename":
                    if (args.length != 3) {
                        System.out.println("Usage: rename oldname.txt newname.txt");
                        return;
                    }
                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);

                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                        printFileProperties(newFile);
                    } else {
                        System.out.println("Rename failed.");
                    }
                    break;

                default:
                    System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error during file operation.");
        }
    }

    // Method to copy file
    public static void copyFile(String source, String destination) throws IOException {
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully.");
    }

    // Method to print file properties
    public static void printFileProperties(File file) {
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        System.out.println("\nFile Properties:");
        System.out.println("Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Size (bytes): " + file.length());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new Date(file.lastModified()));
    }
}