package bubbleSort;

/**
 * Created by Kamil on 2018-06-10.
 */
public class BubbleSort {

    public void swap(int j , int arrayToSwap[]){
        int temporaryValue = arrayToSwap[j];
        arrayToSwap[j] = arrayToSwap[j + 1];
        arrayToSwap[j + 1] = temporaryValue;
    }

    public int[] sort(int[] arrayToSort) {
        boolean swapNeeded = true;
        int i = 1;
        while (i < arrayToSort.length && swapNeeded) {
            swapNeeded = false;
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swap(j , arrayToSort);
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
        return arrayToSort;
    }
}