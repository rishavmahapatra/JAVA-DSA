public class Solution {
    public int solve(int[] A) {
        boolean d = false;
        for(int i=1; i<A.length; i++){      //3 1-2
                                            //
            if(A[i-1]>A[i]){
                d = true;
            }
        }
        if(d==true)
        return 0;
        else return 1;
    }
}
