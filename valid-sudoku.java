/**
* https://leetcode.com/problems/valid-sudoku/description/
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if(c != '.') {
                    if(!set.add(c + " found in row " + i) 
                        || !set.add(c + " found in col " + j) 
                        || !set.add(c + " found in row " + i/3 + " col " + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
