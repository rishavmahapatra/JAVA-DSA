import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        for(int r=1; r<=N; r++){
            for(int c=1; c<=r; c++){
                if(c%2==1) System.out.print(c);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
