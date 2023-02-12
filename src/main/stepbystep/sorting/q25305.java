package main.stepbystep.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt() , k = scanner.nextInt();
        int[] sortNumber = new int[N];
        for (int i = 0; i < N; i++) {
            sortNumber[i] = scanner.nextInt();
        }
        Arrays.sort(sortNumber);

        System.out.println(sortNumber[N-k]);

    }
}
