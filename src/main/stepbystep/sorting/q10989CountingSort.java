package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * counting sort
 */
public class q10989CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];
        Arrays.fill(count, 0); //배열의 모든 요소를 value값으로 초기화
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            count[a] += 1;
        }
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
