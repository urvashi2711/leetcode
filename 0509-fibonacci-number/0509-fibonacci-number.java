class Solution {
    //top down Approach
    private int[] dp = new int[31];
    public int fib(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        memoize(n);
        return dp[n];
        
    }
    public int memoize(int n){
        if(dp[n]!=0) return dp[n];
        if(n<3) return 1;
        else 
            dp[n]= memoize(n-1)+memoize(n-2);
        return dp[n];
    }
}