package main.javaCodingTestInf.hashTimeParsing;

import java.util.HashMap;
import java.util.HashSet;

public class 서로다른빈도수만들기 {
    public int solution(String s){
        int answer = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char x : s.toCharArray()){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        HashSet<Integer> ch = new HashSet<>();
        for(char key : hm.keySet()){
            while(ch.contains(hm.get(key))){
                answer++;
                hm.put(key,hm.get(key)-1);
            }
            if(hm.get(key)==0) continue;
            ch.add(hm.get(key));
        }
        return answer;
    }

    public static void main(String[] args){
        서로다른빈도수만들기 T = new 서로다른빈도수만들기();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }
}
