class Solution {
    public int arrangeCoins(int n) {
        return (int)((-1+Math.sqrt(1+8*(long)n))/2);//n=(x+(x+1))/2 //2n=x^2+x 
        // 2n=x^2+x-1/4+1/4 //2n+1/4=(x+1/2)^2 //x=sqrt(8n+1/2)-1/2 // x=(srt(8n+1)-1)/2
    }
}