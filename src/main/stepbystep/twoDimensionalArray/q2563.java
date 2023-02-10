package main.stepbystep.twoDimensionalArray;

import java.util.Scanner;

/**
 * pixel 느낌로 풀면 됨.
 */
public class q2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[][] size = new int[100][100];
        int N,M;
        int count =0;
        for(int j = 0 ; j < 100 ; j++){
            for (int k = 0; k < 100; k++) {
                size[j][k] = 0;
            }
        }
        for(int i = 0 ;i< T ;i++){
            N = scanner.nextInt();
            M = scanner.nextInt();
            for(int j = N ; j < N+10 ; j++){
                for (int k = M; k < M + 10; k++) {
                    size[j][k] = 1;
                }
            }
        }
        for(int j = 0 ; j < 100 ; j++){
            for (int k = 0; k < 100; k++) {
                if(size[j][k] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
