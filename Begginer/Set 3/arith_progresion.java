import java.util.*;

 class arith_progresion
 {
 	public static void main(String args[])
 	{ 
		int n,a,d,s;
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		a=o.nextInt();
		d=o.nextInt();
		s=n*(2*a+(n-1)*d)/2;
		System.out.println(s);
 	}
 }
