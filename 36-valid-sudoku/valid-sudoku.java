class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for(int r =0; r<9; r++){
            for(int c = 0 ; c<9 ;c++){
                char val = board[r][c];

                if (board[r][c] == '.'){
                    continue;
                }
                String row = val + "in row" + r;
                String col = val + "in col" + c;
                String box = val + "in box" + (r/3) + "-" + (c/3);
                if(seen.contains(row) || seen.contains(col) || seen.contains(box)){
                    return false;
                }
                seen.add(row);
                seen.add(col);
                seen.add(box);
            }
        }
        return true;
    }
}