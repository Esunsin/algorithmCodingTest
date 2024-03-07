package main.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> abc = new ArrayList<>();
        List<Character> skipCharList = new ArrayList<>();
        //skip 빼고 저장
        for (char c : skip.toCharArray()) {
            skipCharList.add(c);
        }
        //숫자 빼기!
        for(int i = 0 ; i < 26 ; i++){
            if(skipCharList.contains((char) ('a' + i))){
               continue;
            }
            abc.add((char) ('a' + i));
        }
        int[] nums = new int[s.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = abc.indexOf(s.charAt(i));
        }

        //이동
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i]+index)%(abc.size());
            System.out.println("nums[i] = " + nums[i]);
            //저장
            answer += abc.get(nums[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        둘만의암호 s = new 둘만의암호();
        System.out.println(s.solution("aukks", "wbqd", 5));
    }
}
