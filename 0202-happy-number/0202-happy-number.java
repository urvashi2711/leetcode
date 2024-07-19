class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedIntegers = new HashSet<>();
        while(true){
            //find sum of squares
            int sum = 0;
            while(n!=0){
                sum += Math.pow(n%10, 2.0);
                n=n/10;
            }
             //if sum is 1 return true;
            if(sum == 1) return true;
            //else the new number is current sum
            n= sum;
            
            if(usedIntegers.contains(n)) return false;
            usedIntegers.add(n);
        }
        
    }
}