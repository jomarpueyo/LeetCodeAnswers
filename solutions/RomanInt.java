//Problem 13. Convert Roman numerials to Integer equivalent https://leetcode.com/problems/roman-to-integer/description/

class RomanInt {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
        
        int result=map.get(s.charAt(0));
        int prev = result; 
        for(int n = 1; n<s.length(); n++){
            if(map.get(s.charAt(n))>prev){
                result = result + map.get(s.charAt(n)) - 2*prev;
            }else{
                result += map.get(s.charAt(n));
            }
            prev = map.get(s.charAt(n));
        }
        return result;
    }
}
