public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length; // rows
        int m = A[0].length;
        int mat[][] = new int[n][m];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                mat[row][col] = A[row][col] + B[row][col] ; 
            }
        }
        return mat;
    }
}
