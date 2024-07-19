class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String word:strs){
            char[] charArr = word.toCharArray(); 
            Arrays.sort(charArr);
            String sortStr = String.valueOf(charArr);
            if(!ans.containsKey(sortStr)){
                ans.put(sortStr,new ArrayList<>());
            }
            ans.get(sortStr).add(word);
        }
        return new ArrayList<>(ans.values());
    }
}
// basic idea is take each word using for each then store it in character array and sort it  
//now if key is already exist in ans then storre tht word if not then create new key and store tht word in it