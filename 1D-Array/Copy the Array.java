public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, int B) {
        int []c = new int[A.length];
        for(int i = 0; i<A.length ; i++){
            c[i]= A[i] + B;
        }
        return c;
    }
}
