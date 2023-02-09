package main.stepbystep.basicMath1;

import java.util.Scanner;

public class q10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T,N,H,Y,W,X;
        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            H = scanner.nextInt();
            W = scanner.nextInt();
            N = scanner.nextInt();
            if(N%H!=0) { //맨 위층을 제외한 나머지 층
                X = N / H + 1;
                Y = N % H;

                if (X < 10) {
                    System.out.println(Y + "0" + X);
                } else {
                    System.out.println(Y + "" + X);
                }
            }
            else{ // 맨 위층
                X = N/H;
                Y = H;
                if (X < 10) {
                    System.out.println(Y + "0" + X);
                } else {
                    System.out.println(Y + "" + X);
                }
            }
        }
    }
}
