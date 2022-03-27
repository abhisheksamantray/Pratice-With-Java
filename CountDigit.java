//write a program to count the digits of the number



import java.util.Scanner;

class CountDigit
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	int count=1;
	
	
		for(int i=0;i<=number;i++)
		{
		   number/=10;
		   count++;
		}
		System.out.println("This number is "+count+" digits");
		       
	}
} 