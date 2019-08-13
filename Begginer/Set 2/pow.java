import java.util.Scanner;
public class pow {
    public static void main(String args[])
    {
        int p,e,v=1,t;
        Scanner s=new Scanner(System.in);
        e=s.nextInt();
        p=s.nextInt();
        t=e;
        while(p!=0)
        {
            v*=t;
            p--;
        }
        System.out.println(v);
    }
}
