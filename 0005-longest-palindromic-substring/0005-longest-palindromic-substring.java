class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int maxLen =1;
        String maxStr=s.substring(0,1);
        for(int i =0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(j-i>maxLen && isPalindrome(s.substring(i,j))){
                    maxLen=j-i;
                    maxStr=s.substring(i,j);
                }
            }
        }
    return maxStr;

    }
    private boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
