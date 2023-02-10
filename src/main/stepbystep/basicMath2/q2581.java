package main.stepbystep.basicMath2;

import java.util.Scanner;

public class q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M,N;
        M = sc.nextInt();
        N = sc.nextInt();
        int count = 0,sum=0;
        int minPrimeNumber=-1;
        for(int i = M;i<=N;i++){
            if(primeNumber(i) == 1) {
                sum += i;
                count++;
            }
            if(primeNumber(i)==1&&count ==1) minPrimeNumber = i;
        }
        if(sum != 0) System.out.println(sum);
        System.out.println(minPrimeNumber);
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
