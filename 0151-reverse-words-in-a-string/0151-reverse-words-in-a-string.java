class Solution {
    public String reverseWords(String s) {
        //to remove starting and last space
        String[] str=s.trim().split("\\s+");
        
        String out="";
        
        for(int i=str.length-1;i>0;i--){
            out += str[i]+" ";
        }
        return out+str[0];//
        
    }
}