
class Arithematic
{
    public int Addition(int A, int B)
    {
        return A+B;
    }

    public int Addition(int A, int B, int C)
    {
        return A+B+C;
    }

    public double Addition(double A, double B)
    {
        return A+B;
    }

    public void Addition(int A, double B)
    {
        System.out.println("Inside first addition");
    }
    
    public void Addition(double A, int B)
    {
        System.out.println("Inside Second addition");
    }
}

public class OverloadingX {
    public static void main(String args[])
    {
        Arithematic aobj = new Arithematic();
        
        int iRet = 0;
        double dRet = 0.0;

        iRet = aobj.Addition(10,11);
        System.out.println("Addition is : "+iRet);

        iRet = aobj.Addition(10, 11, 21);
        System.out.println("Addition is :"+iRet);

        dRet = aobj.Addition(10.8, 11.7);
        System.out.println("Addition is : "+dRet);

        aobj.Addition(11,90.990);
        aobj.Addition(90.99, 11);
    }
}

