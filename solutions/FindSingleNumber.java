//136. Single Number https://leetcode.com/problems/single-number/description/
class FindSingleNumber {
     public int singleNumber(int[] nums) {
//List method
//         List<Integer> list = new ArrayList<>();
//         for(int num : nums){
//             if(list.contains(num)){
//                 list.remove(new Integer(num));
//             }else{
//                 list.add(num);
//             }
//         }
//         return list.get(0);
         
//Xor method
        int xorAns = 0;
        for(int num : nums){
            xorAns ^= num;
        }
        return xorAns;
     }
}
