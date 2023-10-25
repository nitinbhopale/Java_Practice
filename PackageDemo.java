import Marvellous.Maths;
import Marvellous.Infosystems.Arithemactic;

public class PackageDemo {
    public static void main(String Args[])
    {
        Maths mobj = new Maths();
        Arithemactic aobj = new Arithemactic();

        int iRet = 0;
        iRet = mobj.Addition(10, 11);
        System.out.println("Addition is : "+iRet);
        iRet = aobj.Substraction(11,10);
        System.out.println("Substraction is : "+iRet);
    }
}
