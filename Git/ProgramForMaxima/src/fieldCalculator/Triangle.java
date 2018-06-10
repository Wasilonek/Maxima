package fieldCalculator;

/**
 * Created by Kamil on 2018-06-10.
 */
public class Triangle extends Figure {

    private double a, b, c;

    public Triangle() {
        a = b = c = 1;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Triangle(Triangle triangle) {
        this.a = triangle.a;
        this.b = triangle.b;
        this.c = triangle.c;
    }

    @Override
    public void print() {
        System.out.println("Type of object: Triangle");
        System.out.println("a = " + a + " b = "+ b + "c = " + c);
        System.out.println("area : " + calculateArea());
        System.out.println("permimeter : " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
