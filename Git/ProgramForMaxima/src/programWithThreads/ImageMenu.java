package programWithThreads;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Kamil on 2018-06-11.
 */
public class ImageMenu {
    private Scanner scanner;

    public ImageMenu(){
        scanner = new Scanner(System.in);
    }

    private void wrongFormatMessage() {
        System.out.println("You wrote wrong format of data! Please write numbers");
    }

    public void showMenu(){
        int rowSize , columnSize , minRange , maxRange;

        try{
            System.out.println("Enter row size: ");
            rowSize = scanner.nextInt();
            System.out.println("Enter column size: ");
            columnSize = scanner.nextInt();
            System.out.println("Enter min ASCII range: ");
            minRange = scanner.nextInt();
            System.out.println("Enter max ASCII range: ");
            maxRange = scanner.nextInt();
        }catch (InputMismatchException e){
            wrongFormatMessage();
        }finally {
            scanner.nextLine();
        }
    }
}
