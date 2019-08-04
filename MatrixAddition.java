
public class MatrixAddition {
	public int[][] SumMatrices(int[][] matrix1,int[][]matrix2){
		int m=matrix1.length;
		int n=matrix1[0].length;
		int[][] sumMatrix = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		return sumMatrix;
	}
	
}
