package codingPractice;

public class Array3D {

	public static void main(String[] args){
		
		int scores[][][] = new int[2][2][2];  /*[2][2][2] -- first index for no of Students
														  -- Second index for no of Exams
														  -- third index for Exam scores[Internal and External scores]*/
		scores[0][0][0]=99;  //1st student 1st exam Internal
		scores[0][0][1]=98;  //1st student 1st exam External
		
		scores[0][1][0]=77;  //1st student 2nd exam Internal
		scores[0][1][1]=66;  //1st student 2nd exam External
		
		scores[1][0][0]=100; //2nd student 1st exam Internal
		scores[1][0][1]=98;  //2nd student 1st exam External
		
		scores[1][1][0]=88;  //2nd student 2nd exam Internal
		scores[1][1][1]=77;  //2nd student 2nd exam External
		
		for (int i=0;i<scores.length;i++)
		{
			System.out.println("Student "+(i+1)+" :");
			for(int j=0;j<scores[i].length;j++)
			{
				System.out.println("The Marks for exam "+(j+1)+" :");
				for(int k=0;k<scores[i][j].length;k++)
				{
					System.out.println(scores[i][j][k]);
					
				}
			}
			System.out.println();
		}
	}
}
