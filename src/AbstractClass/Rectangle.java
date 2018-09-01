package AbstractClass;

public class Rectangle extends Figura {
    private int sideA;
    private int sideB;
    private int area;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    int getCalculationArea() {
        this.area = sideA * sideB;
        return area;
    }

    void outputArea() {
        System.out.println("Area of Rectangle: " + area + " cm");
    }
}
