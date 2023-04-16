/**
* https://leetcode.com/problems/container-with-most-water/description/
*/


class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea  = 0;

        while(left < right) {
            int leftWallHeight = height[left];
            int rightWallHeight = height[right];

            maxArea = Math.max(maxArea, (right - left) * Math.min(leftWallHeight, rightWallHeight));

            if(leftWallHeight > rightWallHeight) {
                right--;
            }
            else {
                left++;
            }
        }

        return maxArea;
    }
}
