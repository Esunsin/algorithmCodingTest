package main.javaCodingTestInf.hashTimeParsing;

import java.util.HashMap;

public class 음수가있는부분수열 {
    public int solution(int[] nums, int m){
        int answer = 0;
        int sum = 0 ;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int x : nums){     //for(int i = 0 ; i < nums.length ; i++){
            sum += x;
            int storeNum = sum - m;
            if(hm.containsKey(storeNum)) {
                answer += hm.get(storeNum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return answer;
    }

    public static void main(String[] args){
        음수가있는부분수열 T = new 음수가있는부분수열();
        System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
        System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
        System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
    }
}
