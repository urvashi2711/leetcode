class Solution {
    public boolean isPowerOfThree(int n) {
        return ( n>0 &&  1162261467%n==0);//3^19=1162261467 and 3^20 is bigger than int
    }
}