package main.stepbystep.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11653소인수분해_시간초과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp = N;
        while(N>1){
            int a=2;
            while(true){
                if(primeNumber(a) == a && N%a==0){
                    N = N/a;
                    System.out.println(a);
                    break;
                }
                a++;
            }
        }
    }
    //소수구하기
    static int primeNumber(int N){
        int count =0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        if(count == 2) return N;
        else return -1;
    }
}
