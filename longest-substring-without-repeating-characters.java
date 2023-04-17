/**
* https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) {
            return s.length();
        }

        Set<Character> set = new HashSet<>();
        int prev = 0;
        int forward = 0;
        int maxLength = 1;

        while(forward < s.length()) {
            while(set.contains(s.charAt(forward))) {
                set.remove(s.charAt(prev++));
            }

            set.add(s.charAt(forward));
            maxLength = Math.max(maxLength, forward - prev + 1);

            forward++;
        }

        return maxLength;
    }
}
