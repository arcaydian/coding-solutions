/**
* https://leetcode.com/problems/product-of-array-except-self/description/
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int productSoFar = 1;

        for(int i = 0; i < nums.length; i++) {
            ans[i] = productSoFar;
            productSoFar *= nums[i];
        }

        productSoFar = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= productSoFar;
            productSoFar *= nums[i];
        }

        return ans;
    }
}
