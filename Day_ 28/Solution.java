// https://leetcode.com/problems/implement-rand10-using-rand7/

/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int v1 = rand7();
        int v2 = rand7();
        while(v1 > 5)
            v1 = rand7();
        while(v2 == 7)
            v2 = rand7();
        
        return v2 <= 3 ? v1 : v1 + 5; 
    }
}
