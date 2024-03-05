package main.programmers.greedy;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] check = new int[n];
        //초기화
        Arrays.fill(check, 1);
        //여벌 옷 체크
        for (int i : reserve) {
            check[i-1] = 2;
        }
        //체육복 없는 사람 체크
        for(int i : lost){
            check[i - 1] --;
        }

        //빌려주기
        if (check[0] == 2 && check[1] == 0) {
            check[0]--;
            check[1] = 1;
        }
        for (int i = 1; i < n-1; i++) {
            if(check[i] == 2 && check[i-1] == 0){
                check[i-1] = 1;
                check[i]--;
            }
            if(check[i] == 2 && check[i+1] == 0){
                check[i+1] = 1;
                check[i]--;
            }
        }
        if(check[n-1] == 2 && check[n-2] == 0){
            check[n - 2] = 1;
        }
        for (int i : check) {
            if (i>0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        체육복 s = new 체육복();
        System.out.println(s.solution(5, new int[]{1,2,3,4,5}, new int[]{1}));
    }
}
