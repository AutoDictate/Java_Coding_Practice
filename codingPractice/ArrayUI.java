package codingPractice;
import java.util.*;
public class ArrayUI {

	public static void main(String[] args){
		
		System.out.println("How many friends name you gonna to Enter: ");
		Scanner input = new Scanner(System.in);
		int length=input.nextInt();
		
		String names[]= new String[length];
		for(int counter=0;counter<length;counter++)
		{
			System.out.println("Enter name of Friend: "+(counter+1));
			names[counter]=input.next();
		}
		input.close();
		
		System.out.println();
		System.out.println("Those Idiots are as follows");
		
		for(int i=0;i<length;i++)
		{
			System.out.println((i+1)+" "+names[i]);
		}
	}
}
