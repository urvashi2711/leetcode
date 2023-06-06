class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arrlist=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(dividingNumber(i)) arrlist.add(i);
        }
       return arrlist; 
    }
    boolean dividingNumber(int num){
        for(int j=num;j>0;j/=10){
            if(j%10==0 || num%(j%10)!=0){
                return false;
            }
        }
        return true;
    }
}