package main.stepbystep.twoDimensionalArray;

import java.util.Scanner;

public class q2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        int[][] twoDimensionalArray1 = new int[N][M];
        int[][] twoDimensionalArray2 = new int[N][M];
        int[][] twoDimensionalArray3 = new int[N][M];
        for (int i=0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                twoDimensionalArray1[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                twoDimensionalArray2[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                twoDimensionalArray3[i][j] = twoDimensionalArray1[i][j]+twoDimensionalArray2[i][j];
            }
        }
        for (int i=0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(twoDimensionalArray3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
