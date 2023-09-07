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
        System.out.println();
        
        poemobj.generatePoem();
    }
}
