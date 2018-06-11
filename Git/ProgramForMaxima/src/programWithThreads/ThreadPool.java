package programWithThreads;

/**
 * Created by Kamil on 2018-06-11.
 */
public class ThreadPool {

    int maxRange , minRange;

    public ThreadPool(int maxRange , int minRange , Image image){
        this.maxRange = maxRange;
        this.minRange = minRange;
        int numberThreads = maxRange;

        MyThread[] threads = new MyThread[numberThreads];

        for ( int i = 0; i < numberThreads; i++ )
            ( threads[i] = new MyThread( image, i, ( char ) ( i + minRange ) ) ).start();

        for ( int i = 0; i < numberThreads; i++ ) {
            try {
                threads[i].join();
            } catch ( InterruptedException e ) {
                System.out.println("Join error");
            }
        }
    }


}
