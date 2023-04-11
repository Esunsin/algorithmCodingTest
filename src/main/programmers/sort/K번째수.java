package main.programmers.sort;

import java.util.Arrays;


public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i < commands.length;i++){
            int n1 = commands[i][0];
            int n2 = commands[i][1];
            int n3 = commands[i][2];

            int[] cutArray = new int[n2-n1+1];
            for(int j = n1-1; j < n2 ; j ++){
                cutArray[j - n1 + 1] = array[j];
            }
            Arrays.sort(cutArray);
            answer[i] = cutArray[n3-1];
        }

        return answer;
    }
}
