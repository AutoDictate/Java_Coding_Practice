package patternPractice;

import java.util.Scanner;

public class PyramidMirrorL {

	public static void main(String[] args){
		
        System.out.print("Enter no of rows You want to Print: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i =1;i<=row;++i)
		{
			for(int j=row;j>=i;--j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
