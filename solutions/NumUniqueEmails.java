class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for(String email : emails){
            String[] emailSplit = email.split("@");
            String[] localName = emailSplit[0].split("\\+");
            uniqueEmails.add(localName[0].replace(".","")+"@"+emailSplit[1]);
        }
        return uniqueEmails.size();
    }
}
/* Reflection: This was a question I had for one of my online assessments.
Refering to other posts for guidance, this is a very relative easy question and to utlize String functions.
Looking back, I complicated an easy question into a hard one. 
I need more practice in recognizing the problem and utilzing libraries.
*/
