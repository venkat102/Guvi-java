import java.util.Scanner;
public class vowel {
    public static void main(String args[])
    {
        char a;
        Scanner s=new Scanner(System.in);
        a=s.next().charAt(0);
        if((a>='a'&&a<='z') ||(a>='A'&&a<='Z'))
        {
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            {
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonent");
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        
        
    }
    
}
