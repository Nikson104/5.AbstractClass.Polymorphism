package AbstractClass;

public class Square extends Figura {
    private int side;
    private int area;

    public Square(int side) {
        this.side = side;
    }

    int getCalculationArea() {
        this.area = side * side;
        return area;
    }

    void outputArea() {
        System.out.println("Area of Square: " + area + " cm");
    }
}
