//804. Unique Morse Code Words https://leetcode.com/problems/unique-morse-code-words/description/
class UniqueMorse {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();    //Unique set answer
        for (String word : words){                //Iterate all words
            String temp = "";                     //temporary holder to add to set
            for(char c : word.toCharArray()){     //Iterate through each letter
                temp+= morseCode[c-'a'];          //Subtract the character from 'a' for code
            }
            set.add(temp);                        //Add to set (will not add duplicates)
        }
        return set.size();                        //Return the number of uniques
    }
}
