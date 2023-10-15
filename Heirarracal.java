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

class DerivedX extends Base
{
    public int P,Q;

    public DerivedX()
    {
        System.out.println("DerivedX Constructor");
    }

    public void sun()
    {
        System.out.println("Inside Sun Method");
    }
}

public class Heirarracal 
{
    public static void main(String args[])
    {
        Derived dobj1 = new Derived();
        DerivedX dobj2 = new DerivedX();

        dobj1.fun();
        dobj1.gun();

        dobj2.fun();
        dobj2.sun();
    }   
}

