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

class DerivedX extends Derived
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

public class Multilevel 
{
    public static void main(String args[])
    {
        DerivedX dobj = new DerivedX();

        dobj.fun();
        dobj.gun();
        dobj.sun();
    }   
}
