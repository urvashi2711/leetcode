class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int r=x%10;
           finalNum = (finalNum*10)+r;
            x=x/10;
        }
      
        if(x<0){
            return (int)(-1*finalNum);
        }
        if(finalNum>Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        return (int)finalNum;
    }
}
 