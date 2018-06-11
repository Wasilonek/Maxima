package fieldCalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kamil on 2018-06-10.
 */
public class CreateFigure {
    private Figure figure;
    private Scanner scanner;

    public CreateFigure() {
        scanner = new Scanner(System.in);
    }

    public Figure create(String whatFigureISholudCreate) {
        switch (whatFigureISholudCreate) {
            case "Triangle": {
                figure = createTriangle();
                break;
            }
            case "Square": {
                figure = createSquare();
                break;
            }
            case "Circle": {
                figure = createCirlce();
                break;
            }
        }
        return figure;
    }

    public Triangle createTriangle() {
        do {
            try {
                System.out.print("Enter a: ");
                double a = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b = scanner.nextDouble();
                System.out.print("Enter c: ");
                double c = scanner.nextDouble();
                if (a > 0 && b > 0 && c > 0) {
                    if (a < b + c && b < a + c && c < a + b) {
                        return new Triangle(a, b, c);
                    } else {
                        System.out.println("The triangle can not be built of such values");
                    }
                } else {
                    System.err.println("At least one of number is less or equal zero! Try again");
                }

            } catch (InputMismatchException e) {
                System.out.println("You wrote wrong format of data! Please write numbers");
            }finally {
                scanner.nextLine();
            }

        } while (true);
    }

    public Square createSquare() {
        do {
            try {
                System.out.println("Enter a: ");

                double a = scanner.nextDouble();

                if (a <= 0) {
                    System.err.println("A is less or equal zero! Try again");
                } else {
                    return new Square(a);
                }
            } catch (InputMismatchException e) {
                System.out.println("You wrote wrong format of data! Please write numbers");
            } finally {
                scanner.nextLine();
            }

        } while (true);
    }

    public Circle createCirlce() {
        do {
            try {
                System.out.print("Enter radius: ");

                double radius = scanner.nextDouble();

                if (radius <= 0) {
                    System.err.println("Radius is less or equal zero! Try again");
                } else {
                    return new Circle(radius);
                }
            } catch (InputMismatchException e) {
                System.out.println("You wrote wrong format of data! Please write numbers");
            } finally {
                scanner.nextLine();
            }
        } while (true);
    }
}
