import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        Poem poemobj = new Poem();
        poemobj.Poemscanner();
        Poem samplepoem = new Poem(null);
<<<<<<< HEAD
        System.out.println();
        
        poemobj.generatePoem();
=======

        //tells user to press button
        System.out.println(Poem.message());

        //generates poem
        Poem(generatePoem());

        
        System.out.print(samplepoem.title);
        System.out.print(samplepoem.author);

>>>>>>> d2942134b122473237a4ebc957c9e8e7f0769a4d
    }
}
