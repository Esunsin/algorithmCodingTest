package main.stepbystep.basicMath1;

import java.util.Scanner;

public class q2775 { //걍 2차원 배열로 깡으로 넣어야댐 -> 공식 없음.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,k,n;
        int[][] apt = new int[15][15];
        //apt 설정
        for (int i = 0; i < 15; i++) {
            apt[0][i] = i;
        }
        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
        }
        for (int i = 1; i < 15; i++) {
            for(int j = 2;j<15;j++){
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }
        //계산
        T = sc.nextInt();
        for(int i = 0 ;i<T;i++){
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}
