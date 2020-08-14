// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0)
            return 0;
        
        int count = 0;
        Set<Character> set = new HashSet<Character>();
        
        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                count++;
                set.remove(ch);
            }
            else {
                set.add(ch);
            }
        }

        return set.size() == 0 ? count*2 : count*2 + 1;
    }
}
