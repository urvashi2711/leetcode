class Solution {
    public int fib(int n) {
        if(n==1 || n==0){
            return n;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int fib=fib1+fib2;
        return fib;
    }
}