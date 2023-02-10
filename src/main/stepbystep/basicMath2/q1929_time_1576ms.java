package main.stepbystep.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오. (1 ≤ M ≤ N ≤ 1,000,000)
 */
public class q1929_time_1576ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M,N,count;
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        M = Integer.parseInt(stringTokenizer.nextToken());
        N = Integer.parseInt(stringTokenizer.nextToken());
        for(int i = M ; i<=N ; i++){
            count = 0;
            if(i ==1){
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("i = " + i);
            }
        }
    }

}
