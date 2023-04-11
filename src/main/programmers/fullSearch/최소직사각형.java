package main.programmers.fullSearch;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 1;
        int n = sizes.length;
        //가장 긴 부분으로 눕히기
        int tmp = 0;
        for(int i = 0 ; i < n ; i++){
            if(sizes[i][0] < sizes[i][1]){
                tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }

        for(int i = 0 ; i < 2 ; i++){
            int max = sizes[0][i];
            for(int j = 0 ; j < n ; j++){
                if(max < sizes[j][i]) max = sizes[j][i];
            }
            answer = answer*max;
        }
        return answer;
    }
}
