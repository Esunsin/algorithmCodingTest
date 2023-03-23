package main.javaCodingTestInf.simulation;

import java.util.Arrays;

public class 사다리타기 {
    public char[] solution(int n, int[][] ladder){
        char temp;
        char[] answer = new char[n];
        String q = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < n; i++) {
            answer[i] = q.charAt(i);
        }
        for(int i = 0 ;i < ladder.length;i++){ //세로줄 만큼
            for (int j = 0; j < ladder[i].length; j++) { //가로줄 확인해서 이동
                int a = ladder[i][j]; //사다리가 있는 곳
                temp = answer[a - 1];
                answer[a-1] = answer[a];
                answer[a] = temp;
            }
        }
        /*
        for(int[] line : ladder){
            for (int x : line) {
                char tmp = answer[x];
                answer[x] = answer[x - 1];
                answer[x-1] = tmp;
            }
        }*/


        
        return answer;
    }

    public static void main(String[] args){
        사다리타기 T = new 사다리타기();
        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }

}
