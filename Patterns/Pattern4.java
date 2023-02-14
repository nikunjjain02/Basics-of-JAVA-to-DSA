/*
 * This is a number pyramid
 * Here a user inputs the number of row and accordingly a pyramid of that many rows will be generated
 * Example for 5 row pyramid would be
 *      1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5
 */

import java.util.*;

public class pattern4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int rows , k=0;
		
		System.out.println("Enter the number of rows");
		rows = sc.nextInt();

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print(i+" ");
	        ++k;
	      }

	      System.out.println();
	    }
	}

}
