/**
* https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candy: candies) {
            maxCandies = Math.max(maxCandies, candy);
        }


        List<Boolean> list = new ArrayList<>();
        for(int candy: candies) {
            if(candy + extraCandies >= maxCandies) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }

        return list;
    }
}
