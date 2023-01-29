package codingPractice;

public class ArrayCopy {

	public static void main (String[] args){
		
		int marks[]= {22,56,89,23,15};
		int markscopy[] = new int[5];
		
		markscopy = marks;
		System.arraycopy(marks, 0, markscopy, 0,marks.length);
		
		/*for (int i=0;i<=(marks.length)-1;i++)
		{
			
			System.out.println(marks[i]);
	
		}
		System.out.println("\n");
		for (int i=0;i<=(markscopy.length)-1;i++)
		{
			
			System.out.println(markscopy[i]);
	
		}*/
		
		for(int i:markscopy)
		{
			System.out.print(i+" ");
		}
	}
}
