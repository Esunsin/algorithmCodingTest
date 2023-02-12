package main.stepbystep.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q2587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 5 , sum = 0;
        int[] sortNumber = new int[N];
        for (int i = 0; i < N; i++) {
            sortNumber[i] = scanner.nextInt();
        }
        Arrays.sort(sortNumber);
        for (int i = 0; i < N; i++) {
            sum += sortNumber[i];
        }
        System.out.println(sum/5);
        System.out.println(sortNumber[2]);
    }
}
