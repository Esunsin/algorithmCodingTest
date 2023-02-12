package main.stepbystep.sorting;

import java.util.Scanner;

public class q11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] sum = new int[N];
        for(int i = 0 ; i < N ; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            sum[i] = x[i]+y[i];
        }
        
    }
}
