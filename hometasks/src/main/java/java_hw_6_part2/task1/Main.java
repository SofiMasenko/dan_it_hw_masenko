package java_hw_6_part2.task1;

public class Main {
    public static void main(String[] args) {

        Figure square = new Square(5.0);
        Figure triangle = new Triangle(6.0, 4.0, 5.0, 5.0, 6.0);
        Figure circle = new Circle(3.0);

        System.out.println("SQUARE");
        System.out.println("Information: " + square.toString());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println();

        System.out.println("TRIANGLE");
        System.out.println("Information: " + triangle.toString());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println();

        System.out.println("CIRCLE");
        System.out.println("Information: " + circle.toString());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter(length): " + circle.getPerimeter());
        System.out.println();

        System.out.println("PROCESSING AN ARRAY OF FIGURES");
        Figure[] figures = {square,triangle, circle};
        for (Figure fig : figures) {
            System.out.println(fig);
            System.out.println("-> Площа: " + fig.getArea() + " | Периметр: " + fig.getPerimeter());
        }

    }
}
