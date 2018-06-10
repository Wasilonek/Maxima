package fieldCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Kamil on 2018-06-10.
 */
public class Menu {

    private Scanner scanner;
    private CreateFigure createFigure;
    private Figure figure;

    public Menu() {
        scanner = new Scanner(System.in);
        createFigure = new CreateFigure();
    }

    public void showMenu() {
        System.out.println();
        int whatFigureToCreate = 0;
        do {
            System.out.println("Menu: \nTriangle (Press 1)\nSquare (Press 2)\nCircle (Press 3)\nExit (Press 4)");
            try {
                whatFigureToCreate = scanner.nextInt();

                switch (whatFigureToCreate) {
                    case 1: {
                        figure = createFigure.create("Triangle");
                        figure.print();
                        break;
                    }
                    case 2: {
                        figure = createFigure.create("Square");
                        figure.print();
                        break;
                    }
                    case 3: {
                        figure = createFigure.create("Circle");
                        figure.print();
                        break;
                    }
                    case 4: {
                        return;
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("You wrote wrong format of data! Please write numbers");
            } finally {
                scanner.nextLine();
            }
        } while (whatFigureToCreate != 4);
    }
}
