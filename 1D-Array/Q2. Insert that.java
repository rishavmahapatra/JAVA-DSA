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
        //reading inputs of array from user
        int []a = new int[N];
        for(int i=0; i<N; i++){
            a[i]= sc.nextInt();
        }
        int b= sc.nextInt();
        int []c= new int[N+1];
        
        c[b-1] = sc.nextInt();
        for(int i=0; i<b-1;i++){
            c[i]=a[i];
        }

        for(int i = b; i<=N; i++){
            c[i]= a[i-1];
        }
        for(int i=0; i<=N; i++){
            System.out.print(c[i]+ " ");
        }
    }
}
