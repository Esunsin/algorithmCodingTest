package main.stepbystep.twoDimensionalArray;

import java.util.Scanner;

public class q2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num[i][j] = scanner.nextInt();
            }
        }
        int max = num[0][0];
        int n = 1,m=1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max < num[i][j]){
                    max = num[i][j];
                    n = i+1;
                    m = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}
