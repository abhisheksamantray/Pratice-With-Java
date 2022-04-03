//Enter the number of rows needed to print the pattern 
//5
//## Printing the pattern ##
//*********
// *******
//  *****
//   ***
//    *

class PraticePart3
{
	public static void main(String[] args)
	{
	int num=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i-1;j++)
		{
		System.out.print(" ");
		}
		for(int j=i;j<=(2*num)-i;j++)
		{
		System.out.print("*");		
		}
		System.out.println(" ");
	}
	
	}


}