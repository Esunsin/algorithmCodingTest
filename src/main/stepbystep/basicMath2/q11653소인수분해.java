package main.stepbystep.basicMath2;

import java.util.Scanner;

/**
 * 어떤 N이 두 개이상 곱셈(인수)으로 나타낼 수 있을 때 인수 중 한 개 이상은 반드시 √N보다 작거나 같다는 것이다.
 */
public class q11653소인수분해 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        //sqrt 제곱근 메서드
        for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}
