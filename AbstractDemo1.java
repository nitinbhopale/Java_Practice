
abstract class Demo 
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Demo Constructor");
        this.A = 0;
        this.B = 0;
    }
    public abstract void fun();
    // virtual void fun() = 0;
    void gun() // concrete method
    {
        System.out.println("Inside Gun of Demo");
    }
}
class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside Hello constructor");
    }

    public void fun()
    {
        System.out.println("Inside fun of Hello");
    }
}
public class AbstractDemo1 {
    public static void main(String args[])
    {
        System.out.println("Inside Main");
        // Demo dobj = new Demo(); Error

        Hello hobj = new Hello(); 
        hobj.fun();
        hobj.gun();
    }
}

