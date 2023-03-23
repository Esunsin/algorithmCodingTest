package main.javaCodingTestInf.simulation;

import java.util.Arrays;

public class 청소 {
    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        int n = board.length;
        int vec = 0;//방향 0:오른쪽, 1: 아래, 2:왼쪽, 3:위
        Arrays.setAll(answer, num -> 0);
        while(k > 0){ //위치 저장 -> 이동 -> 가능 불가능 판단 -> 가능:이동/불가능:방향전환
            //위치 저장
            int[] temp = new int[2];
            temp[0] = answer[0];
            temp[1] = answer[1];
            //이동
            if(vec == 0) answer[1]++;
            if(vec == 1) answer[0]++;
            if(vec == 2) answer[1]--;
            if(vec == 3) answer[0]--;
            //불가능 판단
            if(answer[0] < 0 || answer[1] < 0 || answer[0] >= n || answer[1] >= n || board[answer[0]][answer[1]]==1){
                //되돌리기
                answer[0] = temp[0];
                answer[1] = temp[1];
                //방향전환
                vec = (vec+1)%4;
            }
            k--;
        }
        return answer;
    }

    public static void main(String[] args){
        청소 T = new 청소();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));

    }
}
