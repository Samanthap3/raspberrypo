import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class poemscanner{

    
    //private ArrayList
    ArrayList<Poem>  library = new ArrayList();

    public poemscanner () throws IOException
    {
        File pfile1 = new File("poem1.txt");
        File pfile2 = new File("poem2.txt");
        File pfile3 = new File("poem3.txt");

        library.add(new Poem(pfile1));
        library.add(new Poem(pfile2));
        library.add(new Poem(pfile3));
        
    }
}