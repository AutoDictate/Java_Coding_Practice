package codingPractice;

public class Array2d {

	public static void main(String[] srgs){
		
		int[][] scores = {{1,2,3},{4,5,6},{7,8,9}};
		int len = scores.length;
		for (int i= 0;i<len;++i)
		{
			for (int j= 0;j<scores[i].length;++j)
			{
				System.out.print(scores[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
