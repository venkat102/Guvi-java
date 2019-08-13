import java.util.Scanner;
public class leap {
    public static void main(String args[])
    {
        int y;
        Scanner s=new Scanner(System.in);
        y=s.nextInt();
        if(y%4==0)
        {
            if(y%100==0)
            {
                if(y%400==0)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
            else
            {
                System.out.println("Yes");
            }
        }
        else
        {
            System.out.println("No");
        }
    }
}
