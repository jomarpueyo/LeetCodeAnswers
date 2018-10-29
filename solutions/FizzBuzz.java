412. Fizz Buzz https://leetcode.com/problems/fizz-buzz/description/

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List ansList = new ArrayList();
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5==0){
                ansList.add("FizzBuzz");
                continue;
            }
            if(i%3==0){
                ansList.add("Fizz");
                continue;
            }
            if(i%5==0){
                ansList.add("Buzz");
                continue;
            }
            ansList.add(String.valueOf(i));
        }
        return ansList;
    }
}
