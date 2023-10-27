import java.util.*;

class AgeInvalid extends Exception 
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}

public class UserDefined {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Age : ");
        int iAge = sobj.nextInt();
        sobj.close();

        try
        {
            if(iAge < 18 )
            {
                AgeInvalid aobj = new AgeInvalid("Your age is below 18");
                throw aobj;
                //throw new AgeInvalid("Your age is below 18");
            }
            else 
            {
                System.out.println("Login Successful");
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Inside Catch Block");
            System.out.println(obj);
        }
    }    
}
