import java.util.Scanner;

class VolumeCalculator {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator v = new VolumeCalculator();

        // Cube
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + v.calculateVolume(side));

        // Rectangular Cube
        System.out.print("\nEnter length, width and height of rectangular cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(l, w, h));

        // Sphere
        System.out.print("\nEnter radius of sphere: ");
        float r = sc.nextFloat();
        System.out.println("Volume of Sphere: " + v.calculateVolume(r));
    }
}