import java.util.*;
import java.io.*;

public class Poem
{
    Random random = new Random();
    ArrayList<Poem> library = new ArrayList();
    String title, author, display;
    int key;
    
    public Poem()
    {
        
    }
    /**
     * Takes a poem and returns the title and author
     */
    public Poem(File a) throws IOException
    {
        Scanner choicepoem = new Scanner(a);
        title = choicepoem.nextLine();
        author = choicepoem.nextLine();
          
    }
   public String generatePoem()
    {
        key = random.nextInt(library.size() - 1);
        Poem poemchosen = library.get(key);
        display = "TITLE: " + poemchosen.title + "\nAUTHOR: " + poemchosen.author;
        return display;
    }
<<<<<<< HEAD

/** 
    * Creates an array list library of poems 
    */
    public void Poemscanner() throws IOException
    {
        File pfile1 = new File("poem1.txt");
        File pfile2 = new File("poem2.txt");
        File pfile3 = new File("poem3.txt");

        library.add(new Poem(pfile1));
        library.add(new Poem(pfile2));
        library.add(new Poem(pfile3));
    }

    /**
     * tells user to push button
     */
=======
    
>>>>>>> d2942134b122473237a4ebc957c9e8e7f0769a4d
    public static String message()
    {
        return "PUSH BUTTON";
    }
    public static void generatePoem() {
    }
    public static void generatePoem() {
    }
}