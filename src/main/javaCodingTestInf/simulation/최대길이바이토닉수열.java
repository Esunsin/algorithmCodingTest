package main.javaCodingTestInf.simulation;
import java.util.*;
class 최대길이바이토닉수열 {
    public int solution(int[] nums){
        int answer = 0;
        int count = 1;
        int max = 1;
        int changeCheck = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1] && changeCheck==0){ //작아지는 부분 check
                changeCheck = 1;
            }
            if(nums[i] < nums[i+1] && changeCheck == 1){ //다시 커지는 부분 check
                count = 1;
                changeCheck = 0;
            }
            if(nums[i] == nums[i+1]){ //같은값 연속일 경우 count 증가됨을 막기 위함 초기화 + 뒤에 정상적으로 진행될때를 예상
                count = 0;
                changeCheck = 0;
            }
            count++;
            if(count > max ){
                max = count;
            }
            //System.out.print(count + " ");
        }
        //System.out.println();
        answer = max;
        return answer;
    }

    public static void main(String[] args){
        최대길이바이토닉수열 T = new 최대길이바이토닉수열();
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
        System.out.println(T.solution(new int[]{1, 1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
