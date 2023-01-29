package methodsPractice;
import java.util.*;
public class Calculator1{
	double input1,input2;
	
	void sum(){
		double sum = input1+input2;
		System.out.print("Sum: "+sum);
	}
	void difference(){
		double difference = input1-input2;
		System.out.print("Sum: "+difference);
	}
	void product(){
		double product = input1*input2;
		System.out.print("Sum: "+product);
	}
	void division(){
		double division = input1*input2;
		System.out.print("Sum: "+division);
	}
}

class calculator{
	
	public static void main (String[] args){
	int choose;
	Scanner input = new Scanner(System.in);
	Calculator1 cal= new Calculator1();
	System.out.println("Enter First no: ");
	cal.input1= input.nextInt();
	System.out.println("Enter second no: ");
	cal.input2= input.nextInt();
	System.out.println("Choose the Operation: ");
	choose = input.nextInt();
	
	
	if(choose==1){
		cal.sum();
	}
	else if(choose==2){
		cal.difference();
	}
	else if(choose==3){
		cal.product();
	}
	else if(choose == 4){
		cal.division();
	}
	else{
		System.out.print("Olunga choose pandra Venna!!@#$%!@#");
	}
	
	
	}	
}