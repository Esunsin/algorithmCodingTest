package main.stepbystep.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sortNumber = new int[N];
        for (int i = 0; i < N; i++) {
            sortNumber[i] = scanner.nextInt();
        }
        Arrays.sort(sortNumber);
        for (int i = 0; i < N; i++) {
            System.out.println(sortNumber[i]);
        }
    }
}
