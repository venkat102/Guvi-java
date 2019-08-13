import static java.lang.Math.pow;
import java.util.Scanner;
public class amstrong {
    public static void main(String args[])
    {
        int a,d=0,t,v,am=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        t=a;
        while(a!=0)
        {
            a=a/10;
            d++;
        }
        a=t;
        while(t!=0)
        {
            v=t%10;
            am+=pow(v,d);
            t/=10;
        }
        if(a==am)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
