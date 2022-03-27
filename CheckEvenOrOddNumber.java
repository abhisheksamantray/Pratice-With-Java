//write a program to cheak weather the given number is even or odd
import java.util.Scanner;

class CheckEvenOrOdd
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=sc.nextInt();
	
		if(number%2==0)
		{
		  System.out.println("it is a even number.");
		}
		else
		  System.out.println("it is a odd number.");
		
	}



} 