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

    public String generatePoem()
    {
        String display = "TITLE: " + title + "\nAUTHOR: " + author;
        return display;
    }
}
