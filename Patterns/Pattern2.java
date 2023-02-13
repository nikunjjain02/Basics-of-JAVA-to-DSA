/*
 * To print a Star pattern using JAVA.
 * These are only helpful for logical thinking. It has nothing to do with Placements cracking
 * 
 * Pattern Sample:
 * ****
 * *** 
 * **
 * * 
 */

import java.util.Scanner;

public class pattern2 
{

	public static void main(String[] args) 
	{

		int i , j , n;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		
		for (i=n;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
