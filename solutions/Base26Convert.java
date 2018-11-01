//171. Excel Sheet Column Number https://leetcode.com/problems/excel-sheet-column-number/description/
class Base26Convert {
    public int titleToNumber(String s) {
        int ans = 0;
        for(char c : s.toCharArray()){
            ans *= 26;
            ans += c-'A'+1;
            }
        return ans;
    }
}
/*
Problem: Base-26 counter
"ZZZ" = 
"ZA" = 26*26 + 1
"YA" = 26*25 + 1
*/
