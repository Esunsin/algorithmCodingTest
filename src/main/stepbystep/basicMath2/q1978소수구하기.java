package main.stepbystep.basicMath2;

import java.util.Scanner;

public class q1978소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int count =0;
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int k = primeNumber(a);
            if(k==1) count++;
            System.out.println("q1978.main");
        }
        System.out.println(count);
    }
    //소수구하기
    static int primeNumber(int N){
        int count =0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        if(count == 2) return 1;
        else return 0;
    }
}
