// https://leetcode.com/problems/goat-latin/

class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        char ch;
        int j;
        String result = "";
        for(int i=0; i<words.length; i++) {
            ch = words[i].charAt(0);
            if(isVowel(ch)) {
                words[i] = words[i].concat("ma");
            }
            else {
                words[i] = words[i].concat(String.valueOf(ch));
                words[i] = words[i].substring(1);
                words[i] = words[i].concat("ma");
            }
            j = i+1;
            while(j > 0) {
                words[i] = words[i].concat("a");
                j--;
            }
            result = result.concat(words[i]) + " ";
        }
        return result.trim();
    }
    
    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
