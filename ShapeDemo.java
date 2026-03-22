class Shape {
    double d1, d2;

    // Method to initialize data
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class Triangle
class Triangle extends Shape {

    // Method to calculate area of triangle
    void calculateArea() {
        double area = 0.5 * d1 * d2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Derived class Rectangle
class Rectangle extends Shape {

    // Method to calculate area of rectangle
    void calculateArea() {
        double area = d1 * d2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
class ShapeDemo {
    public static void main(String[] args) {

        // Triangle object
        Triangle t = new Triangle();
        t.getData(10, 5);
        t.calculateArea();

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(8, 4);
        r.calculateArea();
    }
}