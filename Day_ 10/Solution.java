// https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String s) {
    int pow = 0;
    int col = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        col += (s.charAt(i) - 'A' + 1) * Math.pow(26, pow++);
    }
    return col;
}
}
