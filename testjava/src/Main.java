import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Poem samplepoem = new Poem(null);

        //tells user to press button
        System.out.println(Poem.message());

        //generates poem
        Poem(generatePoem());

        
        System.out.print(samplepoem.title);
        System.out.print(samplepoem.author);

    }
}
