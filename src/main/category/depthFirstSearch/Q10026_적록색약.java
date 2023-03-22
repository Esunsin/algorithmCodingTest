package main.category.depthFirstSearch;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q10026_적록색약 {

    static char map[][];
    static boolean check[][];
    static int N;
    static int ordinary = 0;
    static int redGreenMedicine = 0;
    //상하좌우 확인을 위하 좌표
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new char[N][N];
        check = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = temp.charAt(j);
            }
        }
        //일반인
        for (int i=0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!check[i][j]) {
                    dfs(i,j);
                    ordinary++;
                }
            }
        }
        //적록색약
        for (int i=0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                check[i][j] = false;
                if(map[i][j] == 'G') map[i][j] = 'R';
            }
        }
        for (int i=0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!check[i][j]) {
                    dfs(i,j);
                    redGreenMedicine++;
                }
            }
        }
        System.out.println(ordinary + " " + redGreenMedicine);
    }
    static void dfs(int x, int y){
        check[x][y] = true;
        char color = map[x][y];
        //i=0일때 아래쪽 확인, i=1일때 왼쪽 확인, i=2일때 위쪽 확인, i=3일때 오른쪽 확인 -> 모든 부분이 구역이 나뉘었으면 for문 종료
        for (int i = 0; i < 4; i++) {
            int xx = x+dx[i];
            int yy = y+dy[i];
            if(xx >= 0 && yy >=0 && xx < N && yy < N){ //구역이 나뉠때까지 확인하면 탐색
                if(map[xx][yy] == color && !check[xx][yy]){
                    dfs(xx,yy);
                }
            }
        }
    }
}
