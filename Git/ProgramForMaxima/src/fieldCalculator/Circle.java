package fieldCalculator;

/**
 * Created by Kamil on 2018-06-10.
 */
public class Circle extends Figure {
    private double radius;

    public Circle(){
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle){
        this.radius = circle.radius;
    }

    @Override
    public void print() {
        System.out.println("Type of object: Circle");
        System.out.println("radius = " + radius);
        System.out.println("area = " + calculateArea());
        System.out.println("perimeter = " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return  2 * Math.PI * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * Math.pow(radius , 2);
    }
}
