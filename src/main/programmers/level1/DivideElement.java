package main.programmers.level1;

import java.util.Arrays;
import java.util.List;

public class DivideElement {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
        if(count==0) return new int[]{-1};
        int[] answer = new int[count];
        int tmp=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%divisor==0){
                answer[tmp] = arr[i];
                tmp++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        DivideElement divideElement = new DivideElement();

    }
}
