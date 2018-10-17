//Problem 9. Palidrome Number https://leetcode.com/problems/palindrome-number/description/

class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        char [] xArray = (""+x).toCharArray();
        for(int i=0; i<xArray.length/2;i++){
            if(xArray[i]!=xArray[xArray.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
