package main.javaCodingTestInf.simulation;

class 잃어버린강아지 {
    public int solution(int[][] board){
        int answer = 0;
        int time = 0;
        int[] dy = {0,-1,0,1};
        int[] dx = {-1,0,1,0};
        int px=0,py=0,x=0,y=0;
        //위치 확인
        for(int i = 0 ; i < board.length ;i++){
            for(int j = 0; j < board[i].length ; j++){
                if(board[i][j] == 2) {
                    px= j;
                    py= i;
                }
                if(board[i][j] == 3){
                    x = j;
                    y= i;
                }
            }
        }
        //System.out.println(px + " " + py + " " + x + " " + y);
        int p = 1,d = 1;
        while(time < 10000){
            int tpx = px + dx[p];
            int tpy = py + dy[p];
            int tx = x + dx[d];
            int ty = y + dy[d];

            if(tpx < 0 || tpx >= board.length || tpy < 0 || tpy >= board.length || board[tpy][tpx] == 1){
                p = (p+1)%4;
            }
            else {
                px = tpx;
                py = tpy;
            }
            if(tx < 0 || tx >= board.length || ty < 0 || ty >= board.length || board[ty][tx] ==1){
                d = (d+1)%4;
            }
            else{
                x = tx;
                y = ty;
            }
            time++;
            //System.out.println(tpx + " " + tpy + " " +tx + " " + ty);
            if(px == x && py == y){
                break;
            }
        }
        answer = time;
        if(time >= 10000){
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args){
        잃어버린강아지  T = new 잃어버린강아지 ();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}