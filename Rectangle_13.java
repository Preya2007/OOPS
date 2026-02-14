class Rectangle {

    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        System.out.println("Enrollment No. 240390107032");

        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 40;

        Rectangle r2 = new Rectangle();
        r2.width = 3.5;
        r2.height = 35.9;

        System.out.println("Rectangle 1 Details:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        System.out.println();

        System.out.println("Rectangle 2 Details:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());

        System.out.println();

        if (r1.area() > r2.area()) {
            System.out.println("Rectangle 1 has bigger area.");
        } else {
            System.out.println("Rectangle 2 has bigger area.");
        }
    }
}

