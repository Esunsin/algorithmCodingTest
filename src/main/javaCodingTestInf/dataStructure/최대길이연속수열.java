package main.javaCodingTestInf.dataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 최대길이연속수열 {
    public int solution(int[] nums){
        int answer = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        int[] tmp = new int[set.size()];
        int idx = 0;
        for(Integer integer : set){
            tmp[idx] = integer;
            idx++;
        }
        Arrays.sort(tmp);

        int count = 1;

        for(int i = 0 ; i < tmp.length - 1 ; i++){
            if((tmp[i] + 1) == tmp[i+1]){
                count++;
                if(answer < count)
                    answer = count;
            }
            else {
                count = 0;
            }

        }
        if(set.size() == 1){
            return 1;
        }
        return answer;
    }

    public static void main(String[] args){
        최대길이연속수열 T = new 최대길이연속수열();
        System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }
}
