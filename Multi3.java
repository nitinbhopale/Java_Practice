
class Demo extends Thread 
{   
    public void run() // Running State
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current Thread is :"+name);
        for(int i = 1 ; i<100 ; i++)
        {
            System.out.println("Name of Thread is :"+ name+" with counter : "+i);
        }
    }
}

public class Multi3 {
    public static void main(String args[])
    {
        System.out.println("Current Thread is :"+Thread.currentThread().getName());

        Demo obj1 = new Demo(); // New State
        Demo obj2 = new Demo();

        obj1.setName("First_Thread");
        obj2.setName("Second_Thread");
        obj1.start(); // Runnable State
        obj2.start(); 

    }
}
