package main.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사 {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        //성격 저장
        char[] p = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> score = new HashMap<>();
        //초기화
        for (char c : p) {
            score.put(c,0);
        }
        //점수 내기
        for (int i = 0; i < choices.length; i++) {
            char[] chars = survey[i].toCharArray();
            if(choices[i] > 4){
                score.put(chars[1],score.get(chars[1])+choices[i]-4);
            } else if (choices[i] < 4) {
                score.put(chars[0],score.get(chars[0])+4-choices[i]);
            }
        }
        //비교
        for(int i = 0 ; i < 8 ; i += 2){
            if (score.get(p[i]) >= score.get(p[i + 1])) {
                answer.append(p[i]);
            }
            else{
                answer.append(p[i + 1]);
            }
        }
        return answer.toString();
    }
}
