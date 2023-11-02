
class Demo extends Thread 
{   
    public void run() // Running State
    {
        for(int i = 1;i<10;i++)
        {
            try
            {
                System.out.println("Value of i is :"+i);
                Thread.sleep(10000);
            }
            catch(Exception obj)
            {

            }
        }
        System.out.println("End of Thread");
    }
}

public class Multi5 
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("Current Thread is :"+Thread.currentThread().getName());

        Demo obj1 = new Demo(); // New State
        obj1.start(); // Runnable State
        obj1.join();
        System.out.println("End of main thread");
    }
}

