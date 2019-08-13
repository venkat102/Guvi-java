import static java.lang.Math.pow;
import java.util.Scanner;
public class amstrong_interval {
    public static void main(String args[])
    {
        int a,b,i,d=0,t,v,am=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for(i=++a;i<b;i++)
        {
        am=0;
        d=0;
        t=i;
        while(t!=0)
        {
            t=t/10;
            d++;
        }
        t=i;
        while(t!=0)
        {
            v=t%10;
            am+=pow(v,d);
            t/=10;
        }
        if(i==am)
        {
            System.out.print(am+" ");
        }
        
        }
    }    
}
