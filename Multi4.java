
class Demo extends Thread 
{   
    public void run() // Running State
    {
        for(int i = 1;i<1000;i++)
        {
            
        }
        System.out.println("End of Thread");
    }
}

public class Multi4 {
    public static void main(String args[])
    {
        System.out.println("Current Thread is :"+Thread.currentThread().getName());

        Demo obj1 = new Demo(); // New State
        obj1.start(); // Runnable State
        System.out.println("End of main thread");
    }
}
