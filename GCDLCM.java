import java.util.*;

class Main
{
	public static int gcd(int a, int b)		{

		return b==0 ? a : gcd (b, a%b);
	}

	public static int lcm(int a, int b)		{

		return a*b/gcd(a,b);
	}

	static public void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b=sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" is "+gcd(a, b)+", and their LCM is "+lcm(a,b));
		
	}
}


