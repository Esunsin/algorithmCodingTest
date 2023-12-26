package main.swExpertAcademy;

import java.util.Scanner;
import java.util.Stack;

public class 백만장자프로젝트 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int[] prices = new int[a];
            for (int i = 0; i < a; i++) {
                prices[i] = sc.nextInt();
            }
            int max = prices[a - 1];
            int answer = 0;
            for (int i = a - 1; i >= 0; i--) {
                if (max < prices[i]) {
                    max = prices[i];
                    continue;
                }
                answer += max - prices[i];
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }
}
