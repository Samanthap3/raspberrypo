import java.util.*;
import java.io.*;

public class Poem {
    String title,author;
    

    public Poem(File a) throws IOException
    {
        Scanner choicepoem = new Scanner(a);
        String title = choicepoem.nextLine();
        String author = choicepoem.nextLine();
    }
}
