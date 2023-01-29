package codingPractice;

public class Array {
	public static void main(String[] args){
		
		int marks[] = {23,24,54,56,45};
		
		int total=0;
		
		for(int count=0;count<marks.length;count++)
		{
			total+=marks[count];
		}	
		System.out.println(total);
		
		//System.out.println(marks[2]);
		
		
	}

}
