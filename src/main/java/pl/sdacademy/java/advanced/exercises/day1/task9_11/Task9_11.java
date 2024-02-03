package pl.sdacademy.java.advanced.exercises.day1.task9_11;

public class Task9_11 {
    public static void main(String[] args) {
        // zadanie 9
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
        System.out.println(center.getX());
        System.out.println(center.getY());
        System.out.println(point.getX());
        System.out.println(point.getY());

        // zadanie 10
        MoveDirection moveDirection = new MoveDirection(1,2);
        circle.move(moveDirection);

        double radiusAfterMove = circle.getRadius();
        double perimeterAfterMove  = circle.getPerimeter();
        double areaAfterMove  = circle.getArea();

        System.out.println("RadiusAfterMove : " + radiusAfterMove ); //3
        System.out.println("PerimeterAfterMove : " + perimeterAfterMove ); //
        System.out.println("AreaAfterMove : " + areaAfterMove ); //9 * 3,14 = ~28

        System.out.println("Point2D:");
        System.out.println(center.getX());
        System.out.println(center.getY());
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
