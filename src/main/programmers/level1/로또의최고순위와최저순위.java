package main.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 로또의최고순위와최저순위 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int winCount = 0;
        int deleteCount =0;
        // 0을 제외한 수
        for(int a : lottos){
            for(int num : win_nums){
                if(a == num) winCount++;
            }
            if(a == 0) deleteCount++;
        }
        answer[0] = 7 - (winCount+deleteCount);
        answer[1] = 7 - winCount;
        for (int i = 0; i < 2; i++) {
            if(answer[i] > 6) answer[i] = 6;
        }


        return answer;
    }

    public static void main(String[] args) {
        로또의최고순위와최저순위 s = new 로또의최고순위와최저순위();
        System.out.println(Arrays.toString(s.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(s.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 31, 10, 19, 6, 45}, new int[]{31, 10, 45, 1, 6, 19})));
    }
}
