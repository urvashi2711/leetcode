class Solution {
    public int reverse(int x) {
        long revnum = 0;
        while(x!=0){
            int y=x%10;
            revnum = (revnum*10)+y;
            x = x/10;
        }
        if(x<0){
            return (int)(-1*revnum);
        }
        if(revnum>Integer.MAX_VALUE || revnum<Integer.MIN_VALUE){
            return 0;
        }
        return (int)revnum;
    }
}