
class Point {
    int x;
    int y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

    System.out.println("Enrollment No. 240390107032");
        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();
  
        Point p2 = new Point(10, 20);
        System.out.println("Parameterized Constructor:");
        p2.display();

        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();
    }
}
