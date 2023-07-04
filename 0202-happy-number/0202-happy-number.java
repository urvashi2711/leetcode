class Solution {
    public boolean isHappy(int n) {
       int slow=n;
       int fast=n;
        while(true){
            slow=next(slow);
            fast=next(next(fast));
            if(slow==1 || fast==1){
                return true;
            }if(slow==fast){
                return false;
            }
        }
    }
    public int next(int num){
        int ans=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            ans=ans+digit*digit;
        }
        return ans;
    }
   
}