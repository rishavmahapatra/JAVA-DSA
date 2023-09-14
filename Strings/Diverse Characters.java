public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A) {
        int N = A.length();
        int countA = 0;
        int countD = 0;
        for(int i= 0; i<N;i++){
            char ch = A.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                countA +=1;
            }
            else if (ch>='0' && ch<='9'){
                countD += 1;
            }
        }
        if(countA>countD){
            return countA;
        }
        else  return countD;
    }
}
