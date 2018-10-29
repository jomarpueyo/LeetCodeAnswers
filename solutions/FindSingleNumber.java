//136. Single Number https://leetcode.com/problems/single-number/description/
class FindSingleNumber {
//List Method
//     public int singleNumber(int[] nums) {
//         List<Integer> list = new ArrayList<>();
//         for(int num : nums){
//             if(list.contains(num)){
//                 list.remove(new Integer(num));
//             }else{
//                 list.add(num);
//             }
//         }
//         return list.get(0);
//     }

//XorAns method
    public int singleNumber(int[] nums) {
        int xorAns = 0;
        for(int num : nums){
            xorAns ^= num;
        }
        return xorAns;
    }
}
