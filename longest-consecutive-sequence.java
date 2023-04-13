/**
* https://leetcode.com/problems/longest-consecutive-sequence/description/
*/

class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length < 2) return nums.length;

       Set<Integer> set = new HashSet<>();
       int max = 1;

       for(int num: nums) {
           set.add(num);
       } 
        
       for(int num: nums) {
           int currentCount = 1;
           if(!set.contains(num - 1)) {
               while(set.contains(++num)) {
                   currentCount++;
               }
               max = Math.max(max, currentCount);
           }
       }

       return max;
    }
}
