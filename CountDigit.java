//write a program to print the digit sum of number



import java.util.Scanner;

class CountDigit
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	int res=0;
			
		while(number>0)
		{
		int mod=number%10;
		res=res+mod;
		number/=10;
		}
		System.out.println("The digit sum of the number is "+res);		   		       
	}	 
} 