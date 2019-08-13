import java.util.Scanner;
public class prime_interval {
    public static void main(String args[])
    {
        int a,b,i=0,j=0,t;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for(i=++a;i<b;i++)
        {
            t=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    t=1;
                    break;
                }
            }
            if(t==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
