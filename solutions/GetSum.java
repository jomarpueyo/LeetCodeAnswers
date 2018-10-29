//371. Sum of Two Integers https://leetcode.com/problems/sum-of-two-integers/description/
//Without the use of + or - (I am assuming the add operator and not increment '++')

class GetSum {
    public int getSum(int a, int b) {
//First Answer
//return Math.addExact(a,b);
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(min>0){
            max++;
            min--;
        }
        while(min<0){
            max--;
            min++;
        }
        return max;
    }
}
