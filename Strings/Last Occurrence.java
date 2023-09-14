public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final int B) {
        char c= (char)B;
        int ans = -1 ;
        for(int i=0; i<A.length(); i++){
            if(c == A.charAt(i)){
                ans= i;
            }
        }
        return ans;
    }
}
