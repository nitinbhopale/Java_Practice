
class Base
{
    public void fun() //1000
    {   System.out.println("Inside Base Fun");  }
    public void gun() //2000
    {   System.out.println("Inside Base Gun");  }
    public void sun() //3000
    {   System.out.println("Inside Base Sun");  }
    public void run() //4000
    {   System.out.println("Inside Base Run");  }
}

class Derived extends Base
{
    public void fun() //5000
    {   System.out.println("Inside Derived Fun");   }

    public void sun() //6000
    {   System.out.println("Inside Derived sun");   }

    public void run(int A) // 7000
    {   System.out.println("Inside Derived run with one parameter");   }

    public void mun() //8000
    {   System.out.println("Inside Derived Mun");   }
}

public class Overriding {
    public static void main(String args[])
    {
        Base bobj = new Derived();
        // Base bobj = new Base();
        // Derived dobj = new Derived();
        // Derived dobj = new Base();

        bobj.fun(); // Derived Fun
        bobj.gun(); // Base Gun
        bobj.sun();  // Derived Sun
        bobj.run(); 
        //bobj.run(11);
        //bobj.mun();
    }   
}
