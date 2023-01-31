package methodsPractice;

public class MatrixMultiplication {
	public static void main(String[] args){
		
		int arr1[][]={{1,1,1},{2,2,2},{3,3,3}};
		int arr2[][]={{1,1,1},{2,2,2},{3,3,3}};
		
		int c[][] = new int[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					c[i][j]+=arr1[i][k]*arr2[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}
	
	

}
