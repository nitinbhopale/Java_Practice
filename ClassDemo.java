
class Marvellous
{
    public int i;
    public int j;

    public Marvellous()
    {
        System.out.println("Inside Default Constructor");
        this.i = 0;
        this.j = 0;
    }

    public Marvellous(int a, int b)
    {
        System.out.println("Inside Parameterised Constructor");
        this.i = a;
        this.j = b;
    }

    public void Fun()
    {
        System.out.println("Inside Fun Method");
    }
}

public class ClassDemo {
    public static void main(String args[])
    {    
        System.out.println("Inside Main"); 

        Marvellous mobj1 = new Marvellous(); // Default constructor 
        Marvellous mobj2 = new Marvellous(11,21); // parameterised constructor
        
        System.out.println(mobj2.i); // 11
        System.out.println(mobj2.j); // 21

        mobj2.Fun();
    }
}
