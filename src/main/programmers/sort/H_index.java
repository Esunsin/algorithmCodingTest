package main.programmers.sort;

import java.util.Arrays;

public class H_index {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);

        for(int i = 0; i < n ; i++){
            if(citations[i] >= n-i){
                answer = n-i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        H_index T = new H_index();
        System.out.println(T.solution(new int[]{4,0,6,1,5}));
    }
}
