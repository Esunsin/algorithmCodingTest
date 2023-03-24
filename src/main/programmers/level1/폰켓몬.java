package main.programmers.level1;

import java.util.Arrays;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 1;
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]) continue;
            answer++;
        }
        if(answer > nums.length/2) return nums.length/2;
        return answer;
    }
    // output : 2
    public static void main(String[] args) {
        폰켓몬 t = new 폰켓몬();
        System.out.println(t.solution(new int[]{3, 2, 1, 3}));

    }
}
