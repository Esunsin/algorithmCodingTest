package main.javaCodingTestInf.hashTimeParsing;

import java.util.Arrays;
import java.util.HashMap;

public class 같은빈도수찾기 {
    public int[] solution(String s) {
        int[] answer = new int[5];
        int[] temp = new int[5];
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch , hm.getOrDefault(ch,0)+1);
        }
        int max = Integer.MIN_VALUE;
        String tmp = "abcde";
        for(char key : tmp.toCharArray()){
            if(hm.getOrDefault(key, 0) > max){
                max = hm.getOrDefault(key, 0);
            } }
        for (int i = 0; i < tmp.length(); i++) {
            answer[i] = max - hm.getOrDefault(tmp.charAt(i), 0);
        }
        return answer;
    }
        public static void main (String[]args){
            같은빈도수찾기 T = new 같은빈도수찾기();
            System.out.println(Arrays.toString(T.solution("aaabc")));
            System.out.println(Arrays.toString(T.solution("aabb")));
            System.out.println(Arrays.toString(T.solution("abcde")));
            System.out.println(Arrays.toString(T.solution("abcdeabc")));
            System.out.println(Arrays.toString(T.solution("abbccddee")));
        }
}
