import java.io.*;

public class CreateFile {
    public static void main(String arg[])
    {
        try
        {
            File fobj = new File("PPA.txt");

            fobj.createNewFile();
        }
        catch(Exception obj)
        {
            
        }

        
    }
}
