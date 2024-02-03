package pl.sdacademy.java.advanced.exercises.day1.task9_11;

public class Task9_11 {
    public static void main(String[] args) {
        System.out.println("zadanie 9");
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(3, 0);
        Circle circle = new Circle(center, point);

        double radius = circle.getRadius();
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();

        System.out.println("Radius: " + radius); //3
        System.out.println("Perimeter: " + perimeter); //
        System.out.println("Area: " + area); //9 * 3,14 = ~28

        System.out.println("Point2D:");
        System.out.println("Center: " + center.getX() + "," + center.getY()); // (0,0)
        System.out.println("Point: " + point.getX() + "," + point.getY()); // (3,0)

        System.out.println("\nzadanie 10");
        MoveDirection moveDirection = new MoveDirection(1, 2);
        circle.move(moveDirection);

        double radiusAfterMove = circle.getRadius();
        double perimeterAfterMove = circle.getPerimeter();
        double areaAfterMove = circle.getArea();

        System.out.println("RadiusAfterMove : " + radiusAfterMove); //3
        System.out.println("PerimeterAfterMove : " + perimeterAfterMove); //
        System.out.println("AreaAfterMove : " + areaAfterMove); //9 * 3,14 = ~28

        System.out.println("Point2D:");
        System.out.println("Center: " + center.getX() + "," + center.getY()); // (1,2)
        System.out.println("Point: " + point.getX() + "," + point.getY()); // (4,2)

        System.out.println("\nzadanie 11");
        circle.resize(2);

        double radiusAfterResize = circle.getRadius();
        double perimeterAfterResize = circle.getPerimeter();
        double areaAfterResize = circle.getArea();

        System.out.println("RadiusAfterResize : " + radiusAfterResize); // 6
        System.out.println("PerimeterAfterResize : " + perimeterAfterResize);
        System.out.println("AreaAfterResize : " + areaAfterResize); // 36 * 3,14 > 110

        System.out.println("Point2D:");
        System.out.println("Center: " + center.getX() + "," + center.getY()); // (1,2)
        System.out.println("Point: " + point.getX() + "," + point.getY()); // (7,2)
    }
}
