import java.util.Scanner;
public class factorial {
    public static void main(String args[])
    {
        int v,f=1,i;
        Scanner s=new Scanner(System.in);
        v=s.nextInt();
        for(i=1;i<=v;i++)
        {
            f*=i;
        }
        System.out.println(f);
    }
    
}
