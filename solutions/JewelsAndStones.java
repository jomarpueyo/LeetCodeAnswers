//Problem 771. Jewels and Stones https://leetcode.com/problems/jewels-and-stones/description/

class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        
        char [] jArray = J.toCharArray();                   //Prep both strings to be searched
        char [] sArray = S.toCharArray();               
        
        int count = 0;
            
        for(char x : jArray){                               //For every element in jArray,
            for (char y : sArray){                          //search in the sArray.
                if(x==y){                                   //If two elements are the same, 
                    count++;                                //increment count.
                }
            }
        }
        
        return count;                                       //Return the results after searching.
    }
}
/* 
Notes: String S is searched, J times resulting in N*N time. Brute forced. 
Can be shorter if S is just searched once and J is iterable, by keeping S in a smaller memory? 
HashTable or some sort, keeping track of S characters and the appearance count.
To be worked on in the future...
Date: 10/7/2018
*/
