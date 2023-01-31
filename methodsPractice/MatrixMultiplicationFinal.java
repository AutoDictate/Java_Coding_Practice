package methodsPractice;

public class MatrixMultiplicationFinal {

	public static void main(String[] args){
		
		int row1=4, col1=3,row2=3,col2=4;
		int A[][]={{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
		int B[][]={{2,2,2,2},{3,3,3,3},{5,5,5,5}};
		
		int c[][]= new int[row1][col2];
		multiplyMatrix(row1, col1, A,row2, col2, B,c);
	}
	
	// Create a Method to perform the Multiplication operation
	
	public static void multiplyMatrix(int row1, int col1,int A[][],
            int row2,int col2,int B[][],int c[][]){
		
		System.out.println("The matrix A is: ");
		showMatrix( A,row1,col1);
		System.out.println("The matrix B is: ");
		showMatrix(B,row2,col2);
		System.out.println("The Multiplication matrix is: ");
		for(int i=0;i<row1;i++){
			for(int j=0;j<col2;j++){
				for(int k=0;k<col1;k++){
					c[i][j]+=A[i][k]*B[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// Create a function to Show the Matrix A and B
	
	public static void showMatrix(int M[][],int rowsize,int colsize){
		
		for(int i=0;i<rowsize;i++){
			for(int j=0;j<colsize;j++){
				System.out.print(M[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
