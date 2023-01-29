package patternPractice;

import java.util.Scanner;

public class PyramidCentre {

	public static void main(String[] args){
		System.out.print("Enter no of rows You want to Print: ");
		
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(j);
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		
		
		
	}
}
