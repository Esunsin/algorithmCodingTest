package main.programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < numbers.length-1 ; i ++){
            for(int j = i+1 ; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        answer = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            answer[i] = integer;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        두개뽑아서더하기 s = new 두개뽑아서더하기();
        System.out.println("s.solution() = " + s.solution(new int[]{2, 1, 3, 4, 1,}));
    }
}
