/**
* https://leetcode.com/problems/valid-anagram/description/
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()) {
            if(!map.containsKey(c)) {
                return false;
            }
            int charCount = map.get(c);
            if(charCount <= 1) {
                map.remove(c);
            }
            else {
                map.put(c, charCount - 1);
            }
        }

        return map.size() == 0;
    }
}
