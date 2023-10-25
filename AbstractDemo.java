
abstract class Demo 
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.A = 0;
        this.B = 0;
    }
    abstract void fun();
    // virtual void fun() = 0;
    void gun() // concrete method
    {
        System.out.println("Inside Gun");
    }
}

public class AbstractDemo {
    public static void main(String args[])
    {
        System.out.println("Inside Main");
        // Demo dobj = new Demo(); Error

    }
}
