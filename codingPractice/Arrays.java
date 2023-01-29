package codingPractice;

public class Arrays {

	
	public static void main(String[]args){
		
		int[] score={12,12,13,2,3,34,21,11,56};
		score[3]=23;
		int len=score.length;
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(score[i]);
		}
	}
}
