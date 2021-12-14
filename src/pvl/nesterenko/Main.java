package pvl.nesterenko;

import java.io.OutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main
{

    public static void main(String[] args)
    {
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }

    //----------------------------------------------------------

    public static Runnable runnable1 = new Runnable()
    {

        int Time = 0;

        public void run()
        {
            while(true)
            {
                try
                {
                    Time++;
                    System.out.println(Time);
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    //-----------------------------------------------------

    public static Runnable runnable2 = new Runnable()
    {

        public void run()
        {
            while(true)
            {
                try
                {
                    System.out.println("Thread 2");
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}


