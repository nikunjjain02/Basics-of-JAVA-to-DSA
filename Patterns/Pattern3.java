/*
 * Here in this Pattern Programs we will be making a hollow rectangle.
 * the program is made to be user driven.
 * The input for rows and columns of the program is taken from the user 
 * The sample for the output of 4*3 would be:
 * ****
 * *  *
 * ****	
 */
import java.util.*;
public class pattern3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns respectively");
		 int i, j , n , m;
		 m=sc.nextInt();
		 n=sc.nextInt();
		 for (i = 1; i <= n; i++)
	        {
	            for (j = 1; j <= m; j++)
	            {
	                if (i == 1 || i == n ||
	                    j == 1 || j == m)           
	                    System.out.print("*");           
	                else
	                    System.out.print(" ");           
	            }
	            System.out.println();
		
		

	}

	}
}
