public class Rectangle {

    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

	System.out.println("Enrollment No. 240390107032");
        Rectangle r1 = new Rectangle();
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}
