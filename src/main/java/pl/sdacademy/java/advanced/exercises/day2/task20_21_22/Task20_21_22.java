package pl.sdacademy.java.advanced.exercises.day2.task20_21_22;

public class Task20_21_22 {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        int rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("rectanglePerimeter: " + rectanglePerimeter); //10

        Shape triangle = new Triangle(2, 3, 4);
        int trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("trianglePerimeter: " + trianglePerimeter); //9

        Shape hexagon = new Hexagon(2);
        int hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("hexagonPerimeter: " + hexagonPerimeter); //12
    }
}
