package main.javaCodingTestInf.reviewHashTimeParsing;

import java.util.*;
class 같은빈도수만들기 {
    public int[] solution(String s){
        int[] answer = new int[5];
        String x = "abcde";
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(max < map.get(ch)) max = map.get(ch);
        }
        for(int i = 0 ; i < 5 ; i++){
            answer[i] = max - map.getOrDefault(x.charAt(i),0);
        }
        return answer;
    }

    public static void main(String[] args){
        같은빈도수만들기 T = new 같은빈도수만들기();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }
}