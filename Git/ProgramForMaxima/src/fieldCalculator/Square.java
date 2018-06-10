package fieldCalculator;

/**
 * Created by Kamil on 2018-06-10.
 */
public class Square extends Figure {

    private double a;

    Square() {
        a = 1;
    }

    Square(double a) {
        this.a = a;
    }

    Square(Square square) {
        a = square.a;
    }

    @Override
    public void print() {
        System.out.println("Type of object: Square");
        System.out.println("a = " + a);
        System.out.println("area = " + calculateArea());
        System.out.println("perimeter = " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}
