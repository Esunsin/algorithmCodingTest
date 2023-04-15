package main.programmers.fullSearch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for(int i = 1 ; i < sum ; i++){
            int row = i;
            int col = sum/i;
            if(row > col) continue;
            if((row+2)*(col+2) == sum){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        카펫 t = new 카펫();
        System.out.println(t.solution(8,1));
    }
}
