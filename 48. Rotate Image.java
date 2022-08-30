class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix.length; j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){                
                swap(matrix,i,j,i,matrix.length-1-j);
            }
        }
    }
    
    public static void swap(int[][] matrix,int i,int j,int s,int t){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[s][t];
        matrix[s][t] = temp;
    }
}
