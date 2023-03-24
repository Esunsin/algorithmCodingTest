package main.javaCodingTestInf.hashTimeParsing;

import java.util.HashMap;

public class 한번사용한최초문자 {
    public int solution(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i))==1) return i+1;
        }
        return  -1;
    }

    public static void main(String[] args){
        한번사용한최초문자 T = new 한번사용한최초문자();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}
