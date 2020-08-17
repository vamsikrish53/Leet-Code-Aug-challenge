// https://leetcode.com/problems/distribute-candies-to-people/

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int index = 0, val = 1;
        while(candies > 0) {
            res[index++] += val;
            candies -= val++;
            if(index == num_people)
                index = 0;
            if(val > candies)
                val = candies;
        }
        return res;
    }
}
