import java.util.Scanner;
public class nmultiply {
    public static void main(String args[])
    {
        int n,f=0,t;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<5;i++)
        {
            f+=n;
            System.out.print(f+" ");
        }
    }
}
