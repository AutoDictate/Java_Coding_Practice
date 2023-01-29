package codingPractice;

public class Array2dExample {
	
	public static void main(String[] arge){
		
		int scores[][];
		scores = new int[3][3];
		scores[0][0]=1;
		scores[0][1]=2;
		scores[0][2]=3;
		scores[1][0]=4;
		scores[1][1]=5;
		scores[1][2]=6;
		scores[2][0]=7;
		scores[2][1]=8;
		scores[2][2]=9;
		
		for(int i=0;i<scores.length;i++)
		{
			for(int j=0;j<scores[i].length;j++)
			{
				System.out.print(scores[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	}

}
