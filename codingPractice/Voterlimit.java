package codingPractice;
import java.util.*;
public class Voterlimit {

	public static void main (String[]args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age=n.nextInt();
		if(age>=18){
			System.out.println("You are Eligible");
		}
		else{
			System.out.println("You are Not Eligible");
		}
		
	}
}
