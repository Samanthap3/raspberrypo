import java.util.*;

public class button
{
    static Random random = new Random();
    public static void main(String[] args)
    {
        System.out.println(message());
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