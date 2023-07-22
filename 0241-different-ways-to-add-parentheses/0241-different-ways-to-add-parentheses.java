class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> sol=new LinkedList<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)== '+' || expression.charAt(i)== '-' || expression.charAt(i)== '*'){
                String partsol1=expression.substring(0,i);
                String partsol2=expression.substring(i+1);
                List<Integer> l1=diffWaysToCompute(partsol1);
                List<Integer> l2=diffWaysToCompute(partsol2);
                for(Integer f1:l1){
                    for(Integer f2:l2){
                         int c=0;
                        switch(expression.charAt(i)){
                               
                            case '+': 
                                c=f1+f2;
                                break;
                            case '*':
                                c=f1*f2;
                                break;
                            case '-':
                                c=f1-f2;
                                break;
                        }
                         sol.add(c);
                    }
                   
                }
                
            }
            
        }
        if(sol.size()==0){
                sol.add(Integer.valueOf(expression));
            }
        return sol;
    }
}
