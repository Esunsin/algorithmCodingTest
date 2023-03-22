package main.category.depthFirstSearch;


import java.util.Scanner;

public class Q1987_알파벳 {
    static int R, C;
    static char[][] map;
    static boolean[] check = new boolean[26];
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static int max = 0;

    static void dfs(int x, int y, int count){
        int idxCheck = map[x][y] - 'A';
        check[idxCheck] = true;
        max = Math.max(max, count);
        //탐색
        for (int i = 0; i < 4; i++) {
            int xx = x+dx[i];
            int yy = y+dy[i];
            if(xx < 0 || yy < 0 || xx >=R || yy >= C){
                continue;
            }
            idxCheck = map[xx][yy] - 'A';
            if (check[idxCheck]) {
                continue;
            }
            dfs(xx, yy, count + 1);
            check[idxCheck] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            String s = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        dfs(0, 0, 1);
        System.out.println(max);
    }
}
