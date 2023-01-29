package patternPractice;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args){
		
		System.out.print("Enter no of Rows to be Printed: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=0;i<row;i++)
		{
			if(i==0 || i==row-1){
			for(int j=0;j<row;j++)
			{
				System.out.print("*");
			}
			}
			else{
			
			for(int j= 0;j<row;j++)
			{
				if(j==0 || j==row-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			}
			System.out.println();
			
		}
	}
}
