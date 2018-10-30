//905. Sort Array By Parity https://leetcode.com/problems/sort-array-by-parity/description/
class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int size = A.length;
        int end = size-1, start = 0;
        int[] ansArray = new int[size];
        for(int num : A){
            if(num % 2 == 0){
                ansArray[start]=num;
                start++;
            } else {
                ansArray[end]=num;
                end--;
            }
        }
        return ansArray;
    }
}
