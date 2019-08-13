import java.util.Scanner;
public class sumofn {
    public static void main(String args[])
    {
        int n,i,a=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            a+=i;
        }
        System.out.println(a);
    }
}
