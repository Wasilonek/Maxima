package programWithThreads;

import java.util.Random;

/**
 * Created by Kamil on 2018-06-11.
 */
public class Image {

    private Random random;
    private char image[][];
    private int rowSize, columnSize;
    private int[] histogram;

    public Image(int rowSize, int columnSize ,int minRange , int maxRange ) {
        random = new Random();
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        image = new char[rowSize][columnSize];

        fillImage(minRange , maxRange);

        histogram = new int[maxRange];
        clearHistogram();
    }

    public void fillImage(int minRange , int maxRange) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                image[i][j] = ( char ) ( random.nextInt( maxRange ) + minRange );  // ascii 33-127
                System.out.print( image[i][j] + " " );
            }
            System.out.print( "\n" );
        }
        System.out.print( "\n\n" );
    }

    public void clearHistogram(){
        for(int i = 0 ; i < histogram.length ; i++){
            histogram[i] = 0;
        }
    }

    public void calculateHistogram(char sign , int id){
        for(int i = 0 ; i < rowSize ; i++){
            for (int j = 0; j < columnSize ; i++){
                if(image[i][j] == sign) histogram[id]++;
            }
        }
    }

    public synchronized void printHistogram(){
        
    }

}
