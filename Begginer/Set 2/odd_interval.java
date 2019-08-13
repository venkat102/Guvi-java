import java.util.Scanner;
public class odd_interval {
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for(int i=++a;i<b;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
