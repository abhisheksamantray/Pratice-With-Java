//write a program to reverse a number



import java.util.Scanner;

class ReverseNumber
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	int reverse=0;
	
		for(int i=1;i<=number;i++)
		{
		   int result=number%10;
		   reverse=reverse*10+result;
		   number/=10;
		}
		   System.out.println("The reverse of the number is "+reverse);    
	}
} 