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
        int M = sc.nextInt();
        int [][]mat = new int[N][M];
        int sum;
        for(int row=0;row<N;row++){
            sum=0;
            for(int col=0;col<M;col++){
                mat[row][col]= sc.nextInt();
                sum += mat[row][col];
                
            }
           System.out.print(sum + " ");
        }
    }
}
