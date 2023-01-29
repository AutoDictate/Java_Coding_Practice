package codingPractice;
import java.util.Scanner;
public class InputDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is ur age?\n");
		
		int age ;
		age = input.nextInt();
		
		System.out.println("Well ur age is "+age);
		
		System.out.println("Enter ur Name: ");
		
		String name=input.next();
		
		System.out.println(name);
		
		
		
		
	}

}
