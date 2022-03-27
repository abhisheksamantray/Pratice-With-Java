//write a program to print natural  numbers from m to n



import java.util.Scanner;

class NaturalNumbersTwoPoints
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st point");
	int number=sc.nextInt();
	System.out.println("Enter 2nd point");
	int number1=sc.nextInt();
	
		for(int i=number;i<=number1;i++)
		{
		  if(i>0)	
		  System.out.println ("The Natural Numbers are "+i);	
		}	  		
	}
} 