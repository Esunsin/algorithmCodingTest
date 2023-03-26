package main.javaCodingTestInf.simulation;

import java.util.*;

class 좌석번호 {
    public int[] solution(int c, int r, int k){
        int[] answer = {0,0};
        int[] nx = {0, 1, 0, -1};
        int[] ny = {1, 0, -1, 0};
        boolean[][] check = new boolean[c][r];
        int x=0,y=0,d=0;
        if(k > c*r){
            return answer;
        }
        for(int i = 0 ; i < k-1 ; i++){
            x = answer[0];
            y = answer[1];
            //System.out.println(x + " " + y);
            check[x][y] = true;
            x += nx[d];
            y += ny[d];
            if(x < 0 || x >=c||y<0||y>=r){
                x = answer[0];
                y = answer[1];
                d = (d+1)%4;
                x += nx[d];
                y += ny[d];
                answer[0] = x;
                answer[1] = y;
                continue;
            }
            if(check[x][y] == true){
                x = answer[0];
                y = answer[1];
                d = (d+1)%4;
                x += nx[d];
                y += ny[d];
                answer[0] = x;
                answer[1] = y;
                continue;
            }
            answer[0] = x;
            answer[1] = y;
        }
        answer[0] += 1;
        answer[1] += 1;

        return answer;
    }

    public static void main(String[] args){
        좌석번호 T = new 좌석번호();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }
}