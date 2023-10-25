
interface Circle
{
    float PI = 3.14f;

    float Area(float Radius);
    float Circumference(float Radius); 
}

class PPA implements Circle
{
    public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }
    public float Circumference(float Radius)
    {
        return 2 * PI * Radius;
    }
}
public class InterfaceDemo1 {
    public static void main(String args[])
    {
        PPA pobj = new PPA();
        System.out.println("Value of PI is :"+Circle.PI);
        //Circle.PI = 6.14f;
        float fRet = 0.0f;
        fRet = pobj.Area(10.7f);
        System.out.println("Area is : "+fRet);

        fRet = pobj.Circumference(10.7f);
        System.out.println(("Circumference is : "+fRet));
        
    }
}

