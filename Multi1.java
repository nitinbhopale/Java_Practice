

class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is Running...");
    }

}

public class Multi1 {
    public static void main(String args[])
    {
        System.out.println("Inside main thread");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.start();
        obj2.start();
    }
}
