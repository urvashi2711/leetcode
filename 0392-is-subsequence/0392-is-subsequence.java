class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();
        if(m<1) return true;
        while(i<n && j<m){
            if(ss[j]==tt[i]){
                j++;
            }
            i++;
        }
        return m==j;
    }
}
