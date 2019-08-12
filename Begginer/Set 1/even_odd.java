import java.util.Scanner;

public class even_odd {
    public static void main(String args[])
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a<=0)
        {
            System.out.println("Invalid");
        }
        else if(a%2!=0)
        {
            System.out.println("Odd");
        }
        else if(a%2==0)
        {
            System.out.println("Even");
        }
        
    }
    
}
