/*
 * This pattern program is a Floyd's Triangle
 * It is a quite common pattern and very easy.
 * Example for 3 row floyd's triangle would be:
 * 1
   2 3
   4 5 6
 */


import java.util.*;
public class pattern5
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows;
		rows= sc.nextInt();
		
		int number =1;
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println("");
		}
		
	}

}
