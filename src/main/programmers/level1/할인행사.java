package main.programmers.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantCount = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantCount.put(want[i], number[i]);
        }
        //로직
        for (int i = 0; i < discount.length - 9 ; i++) {
            Map<String, Integer> temp = new HashMap<>();
            boolean a = false;
            for (int j = i; j < i + 10; j++) {
                temp.put(discount[j], temp.getOrDefault(discount[j], 0) + 1);
            }
            for (String s : wantCount.keySet()) {
                if(!(temp.containsKey(s)&&(Objects.equals(temp.get(s), wantCount.get(s))))) a = true;
            }
            if(!a) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        할인행사 s = new 할인행사();
        System.out.println(s.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
