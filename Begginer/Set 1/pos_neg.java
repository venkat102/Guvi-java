import java.util.Scanner;

public class pos_neg {
    
    public static void main(String args[])
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a<0)
        {
            System.out.println("Negative");
        }
        else if(a==0)
        {
            System.out.println("Zero");
        }
        else if(a>0)
        {
            System.out.println("Positive");
        }
    }
    
}
