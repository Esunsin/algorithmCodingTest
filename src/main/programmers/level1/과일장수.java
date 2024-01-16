package main.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] s = new Integer[score.length];
        for(int i = 0 ; i < score.length ; i++){
            s[i] = score[i];
        }
        Arrays.sort(s, Collections.reverseOrder());
        int q = s.length/m;
        for(int i = 0 ; i < q ; i++){
            if(s[m*i+m-1] > k) {answer+=k*m;}
            else {answer += s[m*i+m-1]*m;}
        }
        return answer;
    }

    public static void main(String[] args) {
        과일장수 a = new 과일장수();
        System.out.println(a.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(a.solution(4, 3, new int[]{4,1,2,2,4,4,4,4,1,2,4,2}));
    }
}
