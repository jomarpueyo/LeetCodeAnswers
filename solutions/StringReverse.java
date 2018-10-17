// Problem 344 Reverse String https://leetcode.com/problems/reverse-string/description/

class StringReverse {
    public String reverseString(String s) {             
        char [] sArray = s.toCharArray();   //Convert String to char[] Array
        int swaps = sArray.length/2;        //Find how many swaps (Odds round down)
        int i = 0;                          //Index of character we are on
        for (swaps = swaps; swaps!=0 ; swaps--){    
            char copy = sArray[i];          //Make a copy before over written
            sArray[i] = sArray[sArray.length - 1 - i];  //Overwrite copy
            sArray[sArray.length - 1 - i] = copy;       //Set copy to swap position
            i++;                                        //Increment index
        }
        
        String finalString = String.valueOf(sArray);    //Reset the value of array
        return finalString;     
        
    }
}
