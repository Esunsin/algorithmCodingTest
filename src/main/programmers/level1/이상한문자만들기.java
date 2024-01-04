package main.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            System.out.println("ss = " + ss);
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

        public static void main(String[] args) {
            이상한문자만들기 a = new 이상한문자만들기();
            System.out.println(a.solution("try hello world"));
        }
}
