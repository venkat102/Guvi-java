import java.util.Scanner;
public class sumarr {
    public static void main(String args[])
    {
        int a,n,i,e[],t=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        n=s.nextInt();
        e=new int[a];
        for(i=0;i<a;i++)
        {
            e[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            t+=e[i];
        }
        System.out.println(t);
    }
}
