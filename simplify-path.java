/**
* https://leetcode.com/problems/simplify-path/description/
*/

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] splitPath = path.split("/");
        for(String dir: splitPath) {
            if(dir.length() > 0) {
                if(dir.equals("..")){
                    if(stack.size() > 0) {
                        stack.pop();
                    }
                }
                else if(!dir.equals(".")) {
                    stack.push(dir);
                }
            }
        }
        return "/" + String.join("/", stack);
    }
}
