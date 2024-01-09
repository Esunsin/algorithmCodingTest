package main.programmers.level1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        int size = strings.length;
        String[] answer = new String[size];

        List<String> temp = new ArrayList<>();
        for (String string : strings) {
            temp.add(string.charAt(n)+string);
        }
        Collections.sort(temp);
        for (int i = 0; i < size; i++) {
            answer[i] = temp.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열내마음대로정렬하기 s = new 문자열내마음대로정렬하기();
        System.out.println(s.solution(new String[]{"abce", "abcd", "cdx"},2));
    }
}
