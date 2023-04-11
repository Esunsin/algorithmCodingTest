package main.programmers.fullSearch;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        //1번 수포자
        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == m1[(i)%5]) answer[0]++;
            if(answers[i] == m2[(i)%8]) answer[1]++;
            if(answers[i] == m3[(i)%10]) answer[2]++;
        }
        int max = answer[0];
        int count = 0;
        for(int i = 0; i < 3 ; i++){
            if(max < answer[i]) max = answer[i];
        }
        for(int i=0 ; i < 3 ; i++){
            if(max == answer[i]) count++;
        }
        int[] m = new int[count];
        int idx = 0;
        for(int i=0 ; i < 3 ; i++){
            if(max == answer[i]) m[idx++] = i+1;
        }


        return m;
    }
}
