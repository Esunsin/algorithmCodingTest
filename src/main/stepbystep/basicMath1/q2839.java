package main.stepbystep.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2839 {//설탕배달
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n,m;
        int temp;
        int result=-1;
        n = N / 5;
        for (int i = n; i >= 0 ; i--) {
            temp = N - (5*i);
            if(temp%3==0){
                m = temp/3;
                result = i+m;
                break;
            }
        }
        System.out.println(result);

    }
}
