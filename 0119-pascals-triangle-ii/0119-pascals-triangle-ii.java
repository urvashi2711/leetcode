class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        for(int i =0;i<=rowIndex;i++){
            al.add(1);
            for(int j=i-1;j>0;j--){
                al.set(j,al.get(j-1)+al.get(j));
            }
        }
        return al;
    }
}
// rowindex   row   i   j
//  3         [1]   0   0-1
//  3        [1,1]  1   1-1
//  3       [1,1,1] 2   2-1   [1,2,1] 
//  3     [1,2,1,1] 3    3-1   [1,3,3,1]