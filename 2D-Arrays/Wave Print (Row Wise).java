import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][]mat = new int[N][N];
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                mat[row][col]= sc.nextInt();
            }
        }
        for(int row=0;row<N;row++){
            if(row%2==0){
                for(int col=0;col<N;col++){
                System.out.print(mat[row][col] + " ");
            }
            }
            else for(int col=N-1; col>=0; col--){
                System.out.print(mat[row][col] + " ");
            }
        }
    }
}
