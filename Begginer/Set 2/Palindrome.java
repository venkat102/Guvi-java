import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        int v,t,l,r=0;
        Scanner s=new Scanner(System.in);
        v=s.nextInt();
        t=v;
        while(v!=0)
        {
            l=v%10;
            v/=10;
            r=(r*10)+l;
            
        }
        if(r==t)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
