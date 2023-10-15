class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }

    public void fun()
    {
        System.out.println("Base Fun method");
    }
}

class Derived extends Base
{
    public int X,Y;

    public Derived()
    {
        System.out.println("Derived Constructor");
    }
    public void gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

public class Single 
{
    public static void main(String args[])
    {
        Derived dobj = new Derived();

        dobj.fun();
        dobj.gun();
    }   
}
