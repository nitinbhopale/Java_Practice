class Demo
{
    public int A;
    public final int B;
    Demo()
    {
        this.A = 11;
        this.B = 21;
    }

    Demo(int i , int j)
    {
        this.A = i;
        this.B = j;
    }
};

public class Final1 {
    public static void main(String args[])
    {
        Demo dobj = new Demo();
        System.out.println("Value of A : "+dobj.A);
        System.out.println("Value of B : "+dobj.B);

        dobj.A++; //A
        //dobj.B++; //NA

        Demo dobj2 = new Demo(51,101);
        System.out.println("Value of A : "+dobj2.A);
        System.out.println("Value of B : "+dobj2.B);
    }   
}
