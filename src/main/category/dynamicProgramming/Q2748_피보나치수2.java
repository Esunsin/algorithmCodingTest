package main.category.dynamicProgramming;

import java.util.Scanner;

public class Q2748_피보나치수2 {

    static long[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        arr = new long[N + 1];
        for (int i = 0; i < N + 1; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fib(N));
    }

    public static long fib(int N) {
        if (arr[N] == -1) {
            arr[N] = fib(N - 1) + fib(N - 2);
        }
        return arr[N];
    }

}
