package programWithThreads;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Kamil on 2018-06-11.
 */
public class ImageMenu {
    private Scanner scanner;
    private ThreadPool threadPool;
    private Image image;

    public ImageMenu() {
        scanner = new Scanner(System.in);
    }

    private void wrongFormatMessage() {
        System.out.println("You wrote wrong format of data! Please write numbers");
    }

    public void showMenu() {

        int rowSize, columnSize, minRange, maxRange;

        do {
            try {
                System.out.println("Enter row size: ");
                rowSize = scanner.nextInt();
                System.out.println("Enter column size: ");
                columnSize = scanner.nextInt();
                System.out.println("Enter min ASCII range: (between 33 and 94)");
                minRange = scanner.nextInt();
                System.out.println("Enter max ASCII range: (between 33 and 94)");
                maxRange = scanner.nextInt();
                if (minRange < 33 || minRange > 94 || maxRange < 33 || maxRange > 94) {
                    System.out.println("ASCII range is between 33 and 94");
                    continue;
                }
                if (rowSize > 10000 || columnSize > 10000){
                    System.out.println("Max size is 10000 x 10000");
                    continue;
                }
                if(rowSize <= 0 || columnSize <= 0){
                    System.out.println("Size must be greater than 0");
                    continue;
                }
                    break;
            } catch (InputMismatchException e) {
                wrongFormatMessage();
            } finally {
                scanner.nextLine();
            }
        } while (true);

        image = new Image(rowSize, columnSize, minRange, maxRange);

        threadPool = new ThreadPool(maxRange, minRange, image);
    }
}
