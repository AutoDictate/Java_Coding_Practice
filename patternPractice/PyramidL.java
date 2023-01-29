package patternPractice;
import java.util.*;
public class PyramidL {

	public static void main(String[] args){
		
		System.out.print("Enter no of rows You want to Print: ");
		
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
