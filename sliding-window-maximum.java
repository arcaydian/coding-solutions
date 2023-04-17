/**
* https://leetcode.com/problems/sliding-window-maximum/description/
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];

        for(int i = 0; i < nums.length; i++) {
            if (q.size() > 0 && q.peekFirst() <= i - k) {
                q.pollFirst();
            }
            while(q.size() > 0 && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offerLast(i);

            if(i >= k - 1) {
                result[i - k + 1] = nums[q.peekFirst()];
            }
        }

         return result;
    }
}
