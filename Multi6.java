
class Demo extends Thread 
{   
    public void run() // Running State
    {
        

    }
}

public class Multi6
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("Current Thread is :"+Thread.currentThread().getName());

        Demo obj1 = new Demo(); // New State
        Demo obj2 = new Demo();

        obj1.start(); // Runnable State
        obj2.start();
        
        System.out.println("Priority of obj1 is : "+obj1.getPriority());
        System.out.println("Priority of obj2 is : "+obj2.getPriority());

        obj1.setPriority(8);
        obj2.setPriority(10);

        System.out.println("Priority of obj1 is : "+obj1.getPriority());
        System.out.println("Priority of obj2 is : "+obj2.getPriority());


    }
}

