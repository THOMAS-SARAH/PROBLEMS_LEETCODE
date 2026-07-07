class Solution {
    public long sumAndMultiply(int n) {
        int x =0, sum = 0;
        for( char c : String.valueOf(n).toCharArray()){
            if(c != '0'){
                int d = c - '0';
                 x = x*10 + d;
                 sum += d;
            }
        }

        return x*sum;
        
    }
}
