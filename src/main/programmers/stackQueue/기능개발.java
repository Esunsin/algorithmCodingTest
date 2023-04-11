package main.programmers.stackQueue;
import java.util.*;
public class 기능개발 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] a = new int[speeds.length];
            for(int i = 0 ; i < speeds.length ; i++){
                int temp = 0;
                temp = (100 - progresses[i])/speeds[i];
                if((100 - progresses[i])%speeds[i] != 0){
                    temp +=1;
                }
                a[i] = temp;
            }
            int count = 0;
            int idx = 0;
            ArrayList<Integer> list = new ArrayList();
            for(int i = 0 ; i < a.length ; i++){
                if(a[i] > a[idx]){
                    list.add(count);
                    count = 1;
                    idx = i;
                    if(i == a.length-1){
                        list.add(count);
                    }
                }
                else{
                    count++;
                    if(i == a.length-1){
                        list.add(count);
                    }
                }
            }
            int[] answer = new int[list.size()];
            for(int i = 0 ; i < answer.length ; i++){
                answer[i] = list.get(i);
            }



            return answer;
        }
    }
}
