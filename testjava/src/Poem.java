import java.util.*;
import java.io.*;

public class Poem {
    static Random random = new Random();

    String title,author;
    

    public Poem(File a) throws IOException
    {
        Scanner choicepoem = new Scanner(a);
        String title = choicepoem.nextLine();
        String author = choicepoem.nextLine();
    }

    public static String message()
    {
        return "PUSH BUTTON";
    }

    public static Object generatePoem(/*ArrayList<Object>*/)
    {
        int key = random.nextInt(100/*array.length-1*/);

        return key;
        //return array[key];
    }
}
