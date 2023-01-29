package patternPractice;

import java.util.Scanner;

public class PyramidDiamond {

	public static void main(String[] args){
		System.out.print("Enter no of rows You want to Print: ");
		
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		for(int i =1;i<row;++i)
		{
			for(int j=5;j>row-i-1;--j)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=row-i;++j)
			{
			System.out.print("* ");
			}
		
			System.out.println();
		}
	}
		
		
	}

