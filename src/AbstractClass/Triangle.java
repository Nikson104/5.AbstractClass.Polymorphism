package AbstractClass;

public class Triangle extends Figura {
    private int sideA;
    private int height;
    private double area;

    public Triangle (int sideA, int height){
        this.sideA=sideA;
        this.height=height;
    }

    int getCalculationArea(){
        this.area= 0.5*sideA*height;
        return (int) area;
    }

    void outputArea(){
        System.out.println("Area of Triangle: " + area + " cm");
    }
}
