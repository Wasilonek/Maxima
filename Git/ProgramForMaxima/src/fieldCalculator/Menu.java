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
    private ContainerForFigure containerForFigure;

    public Menu() {
        scanner = new Scanner(System.in);
        createFigure = new CreateFigure();
        containerForFigure = new ContainerForFigure();
    }

    public void showMenu() {
        System.out.println();
        int whatFigureToCreate = 0;
        do {
            System.out.println("Menu: \nTriangle (Press 1)\nSquare (Press 2)\nCircle (Press 3)" +
                    "\nShow list of all figure (Press 4)\nRemove figure (Press 5)\n" +
                    "Update Figure (Press 6)\nExit (Press 7)");
            try {
                whatFigureToCreate = scanner.nextInt();

                switch (whatFigureToCreate) {
                    case 1: {
                        figure = createFigure.create("Triangle");
                        figure.print();
                        containerForFigure.addFigureToList(figure);
                        break;
                    }
                    case 2: {
                        figure = createFigure.create("Square");
                        figure.print();
                        containerForFigure.addFigureToList(figure);
                        break;
                    }
                    case 3: {
                        figure = createFigure.create("Circle");
                        figure.print();
                        containerForFigure.addFigureToList(figure);
                        break;
                    }
                    case 4: {
                        containerForFigure.showAllFigure();
                        break;
                    }
                    case 5: {
                        if(containerForFigure.showAllFigure())
                            break;
                        System.out.println("Enter id figure which need to be remove: ");
                        int idToRemove = scanner.nextInt();
                        containerForFigure.removeFigureFromList(idToRemove);
                        break;
                    }
                    case 6: {
                        if(containerForFigure.showAllFigure())
                            break;
                        System.out.println("Enter id figure which need to be update: ");
                        int idToUpdate = scanner.nextInt();
                        containerForFigure.updateFigure(idToUpdate);
                        break;
                    }
                    case 7:{
                        return;
                    }
                    default:{
                        System.out.println("You did not choose right option");
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("You wrote wrong format of data! Please write numbers");
            } finally {
                scanner.nextLine();
            }
        } while (whatFigureToCreate != 7);
    }
}
