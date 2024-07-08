class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        if(numRows==0){
            return al;
        }
        al.add(new ArrayList<>());
        al.get(0).add(1);
        for(int i=1;i<numRows;i++){  //i is moving from up to down 
            List<Integer> currRow=new ArrayList<>();
            List<Integer> prevRow=al.get(i-1);
            currRow.add(1);
            for(int j=1;j<i;j++){  // j is moving from left to right
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            al.add(currRow);
        }
        return al;
    }
}