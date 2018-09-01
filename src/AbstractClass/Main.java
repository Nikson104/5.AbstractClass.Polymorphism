package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2,3);
        Triangle triangle = new Triangle(2,1);
        Circle circle = new Circle(2);

        square.getCalculationArea();
        rectangle.getCalculationArea();
        triangle.getCalculationArea();
        circle.getCalculationArea();

        square.outputArea();
        rectangle.outputArea();
        triangle.outputArea();
        circle.outputArea();
    }
}
