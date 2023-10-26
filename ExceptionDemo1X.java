import java.util.*;

public class ExceptionDemo1X
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter First Number :");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        try
        {
            System.out.println("Inside Try Block");
            iAns = iNo1 / iNo2 ;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside Catch Block" + obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside index out of bounds exception"+obj);
        }
        catch(Exception obj)
        {
            System.out.println("Inside generic catch block"+obj);
        }
        finally
        {
            System.out.println("Inside Finally Block");
        }

        System.out.println("Division is :"+iAns);

        sobj.close();
    }
}