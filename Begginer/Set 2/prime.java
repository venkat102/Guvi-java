import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
        int a,i=0,t=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for(i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                t=1;
                break;
            }
        }
        if(t==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
