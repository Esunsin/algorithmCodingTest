package main.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        //A-Z의 최저 자리수 찾기
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            int min = 100;
            for (int j = 0; j < keymap.length; j++) {
                char[] chars = keymap[j].toCharArray();
                for (int k = 0; k < chars.length; k++) {
                    if(k > min) break;
                    if(chars[k] == c){
                        min = k;
                        map.put(c, min+1);
                        break;
                    }
                }
            }

        }
        //target 최저 찾기
        for (int i = 0; i < targets.length; i++) {
            char[] chars = targets[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if(!map.containsKey(chars[j])) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(chars[j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        대충만든자판 s = new 대충만든자판();
        System.out.println(Arrays.toString(s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"})));
        System.out.println(Arrays.toString(s.solution(new String[]{"AA"}, new String[]{"BCD"})));
    }
}
