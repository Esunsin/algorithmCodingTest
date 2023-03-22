package main.category.dynamicProgramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1003_피보나치함수 {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(br.readLine());
            fib(t);
            System.out.println(dp[t][0] + " " + dp[t][1]);
        }
    }
    public static Integer[] fib(int t) {
        if (dp[t][0] == null || dp[t][1] == null) {
            dp[t][0] = fib(t - 1)[0] + fib(t - 2)[0];
            dp[t][1] = fib(t - 1)[1] + fib(t - 2)[1];
        }//값이 없을때 재귀 (메모라이징)
        return dp[t];
    }
}
