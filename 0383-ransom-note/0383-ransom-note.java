class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] ac= new int[26];
        
        for(char c:magazine.toCharArray()){
            ac[c-'a']++;// when u subtract 'a' from any character it actaully gives the index of that character like d =100 and a =97 and d-a gives 100-97=3 which is the index of d a=0 b=1 c=2 d=3
        }
        for(char c:ransomNote.toCharArray()){
            if(ac[c-'a']==0) return false;
            ac[c-'a']--;
        }
        return true;
    }
}