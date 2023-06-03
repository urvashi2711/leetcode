class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb=new LinkedList();
        int div3=3;
        int div5=5;
        for(int i=1;i<=n;i++){
            if(i==div3&& i==div5){
                fb.add("FizzBuzz");
                div3 +=3;
                div5 +=5;
            }
            else if(i==div3){
                div3 +=3;
                fb.add("Fizz");
            }
            else if(i== div5){
                div5 +=5;
                fb.add("Buzz");
            }
           else{
               fb.add(Integer.toString(i));
           } 
        }
        return fb;
    }
}