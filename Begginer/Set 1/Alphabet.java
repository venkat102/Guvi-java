import java.util.Scanner;
public class Alphabet {
    public static void main(String args[])
    {
        char a;
        boolean t;
        Scanner s=new Scanner(System.in);
        a=s.next().charAt(0);
        t=Character.isAlphabetic(a);
        if(t)
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("No");
        }
    }
}
