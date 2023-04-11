package main.programmers.stackQueue;
import java.util.*;

class 같은문자는싫어 {
    public int[] solution(int []arr) {
        int temp = arr[0];
        int idx = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(temp == arr[i]){
                temp = arr[i];
            }
            else{
                temp = arr[i];
                idx++;
            }

        }
        int[] answer = new int[idx+1];
        temp = arr[0];
        idx = 0;
        answer[0] = temp;
        for(int i = 1 ; i < arr.length ; i++){
            if(temp == arr[i]){
                temp = arr[i];
            }
            else{
                temp = arr[i];
                answer[++idx] = temp;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
