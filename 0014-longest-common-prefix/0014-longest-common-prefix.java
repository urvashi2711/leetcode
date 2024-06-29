class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String comparator=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(comparator)!=0){
                comparator=comparator.substring(0,comparator.length()-1);
            }
        }
        return comparator;
    }
}