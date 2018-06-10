package bubbleSort;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kamil on 2018-06-10.
 */
public class CreateArrayToSort {

    private Random random;
    private Scanner scanner;

    public CreateArrayToSort() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void wrongFormatMessage() {
        System.out.println("You wrote wrong format of data! Please write numbers");
    }

    public void showMenu() {
        System.out.println("Create array to sort (Press 1)");
        System.out.println("Exit (Press 2)");
    }


    public void getRange() {
        int min = 0, max = 0, size = 0;

        int userChoice = 0;

        do {
            showMenu();
            try {
                userChoice = scanner.nextInt();
            } catch (InputMismatchException e) {
                wrongFormatMessage();
            } finally {
                scanner.nextLine();
            }
            switch (userChoice) {
                case 1: {
                    while (true) {
                        try {
                            System.out.println("Enter lower range of the array: ");
                            min = scanner.nextInt();
                            System.out.println("Enter upper range of the array: ");
                            max = scanner.nextInt();
                            if (min >= max) {
                                System.out.println("Lower range must be bigger than upper");
                                continue;
                            }
                            System.out.println("Enter size of the array: ");
                            size = scanner.nextInt();
                            if (size > 10000) {
                                System.out.println("Max size of the array is 10000 ");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            wrongFormatMessage();
                        } finally {
                            scanner.nextLine();
                        }
                    }
                    generateArray(min, max, size);
                    break;
                }
                case 2: {
                    break;
                }
            }
        } while (userChoice != 2);
    }

    public void generateArray(int min, int max, int size) {

        int arraryToSort[] = new int[size];
        for (int i = 0; i < arraryToSort.length; i++) {
            arraryToSort[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(arraryToSort));
        System.out.println();
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(bubbleSort.sort(arraryToSort)));
    }
}
