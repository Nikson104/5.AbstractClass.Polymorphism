package AbstractClass;

public class Circle extends Figura {
    private int radius;
    private double area;

    Circle (int radius){
        this.radius=radius;
    }

    int getCalculationArea() {
        this.area = Math.PI*radius*radius;
        return (int) area;
    }

    void outputArea(){
        System.out.println("Area of Circle: " + Math.round(area) + " cm");
    }
}
