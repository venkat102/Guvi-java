import java.util.Scanner;
public class noofdigits {
    public static void main(String args[])
    {
        int a,l=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(a!=0)
        {
            a=a/10;
            l++;
        }
        System.out.println(l);
    }
}
