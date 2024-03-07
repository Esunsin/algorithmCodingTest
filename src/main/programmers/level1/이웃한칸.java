package main.programmers.level1;

public class 이웃한칸 {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};
        String tmp = board[h][w];

        for (int i = 0; i < 4; i++) {
            int y = h + dh[i];
            int x = w + dw[i];
            if(h + dh[i] < n && h + dh[i] >= 0 && w + dw[i] < n && w + dw[i] >= 0){
                if (tmp.equals(board[y][x])) {
                    count++;
                }
            }
        }
        return count;
    }

}
