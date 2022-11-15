public class ArrayDuaDimensi {
	
	public static void main(String[] args) {
		/*
		 * cara pertama datatype[] namavariabel;
		 * cara kedua datatype namavariabel[][];
		 * 
		 */
		
		int row = 3, column = 4;
		double[][] x = new double[row][column]; //instance
		
		
		for(int i =0; i < row; i ++) {
			for(int j = 0; j < column; j++) {
				System.out.println(x[i][j] = Math.random());
			}
			
		}
		
		
	}
	
}