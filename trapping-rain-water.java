/**
* https://leetcode.com/problems/trapping-rain-water/description/
*/

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterSum = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                leftMax = Math.max(height[left], leftMax);
                waterSum += leftMax - height[left];
                left++;
            }
            else {
                rightMax = Math.max(rightMax, height[right]);
                waterSum += rightMax - height[right];
                right--;
            }
        }

        return waterSum;
    }
}
