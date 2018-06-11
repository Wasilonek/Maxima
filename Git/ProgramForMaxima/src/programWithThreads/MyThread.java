package programWithThreads;

import org.omg.PortableInterceptor.ObjectReferenceFactory;

/**
 * Created by Kamil on 2018-06-11.
 */
public class MyThread implements Runnable {

    private Image image;
    private int id;
    private char sign;

    public MyThread(Image image, int id, char sign) {
        this.image = image;
        this.id = id;
        this.sign = sign;
    }



    @Override
    public void run() {

    }
}
