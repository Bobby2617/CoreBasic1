/*class B1
{
	public static void main(String[] args)
	{
		int n=0,sum=0;
		while(n<=10)
		{
			sum=sum+n;
			n++;
		}
		System.out.print(sum);
	}
}
import java.util.*;
class B2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.print(sum);
	}
}
import java.util.*;
class B3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int rem,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.print(rev);
	}
}
import java.util.*;
class B4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int temp=n;
		int rem,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
			System.out.print("palindrome number");
		else
			System.out.print("Not a palindrome number");
	}
}
import java.util.*;
class B5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int temp=n;
		int rem,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(temp==sum)
			System.out.print("armstrong number");
		else
			System.out.print("Not a armstrong nnumber");
	}
}
import java.util.*;
class B6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		System.out.print(fib(n));
	}
	public static int fib(int n)
	{
		if(n<=1)
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
import java.util.*;
class B7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int a=0,b=1;
		int c=0;
		for (int i=2;i<n ;i++ )
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.print(c);
	}
}
import java.util.*;
class B8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for (int i=2;i<n ;i++ )
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
import java.util.*;
class B9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		System.out.print(fact(n));
	}
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		return n*fact(n-1);
	}
}
import java.util.*;
class B10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact=fact*i;
		}
		System.out.print(fact);
	}
}
import java.util.*;
class B11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		boolean flag=true;
		for (int i=2;i<n ;i++ )
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.print("prime number");
		else
			System.out.print("Not a prime number");
	}
}
import java.util.*;
class B12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<n ;i++ )
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.print("perfect number");
		else
			System.out.print("Not a perfect number");
	}
}
import java.util.*;
class B13
{
	public static void main(String[] args)
	{
		for (int i=2;i<=100 ;i++ )
		{
			boolean flag=true;
			for (int j=2;j<i ;j++ )
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.print(i+" ");
		}
	}
}*/
