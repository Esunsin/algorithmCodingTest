package main.stepbystep.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count,n,T,s,temp1=0,temp2=0;
        T = Integer.parseInt(br.readLine());
        for(int t= 0;t < T;t++){ //테스트 케이스 만큼
            int N = Integer.parseInt(br.readLine());
            n = N/2;
            for(int i = n; i > 1; i--){
                count = 0;
                s=0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if(i%j==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    temp1 = i;
                    temp2 = N-i;
                    for (int j = 2; j <= Math.sqrt(temp2); j++) {
                        if((temp2)%j==0){
                            s++;
                            break;
                        }
                    }
                    if(s == 0){
                        break;
                    }
                }
            }
            System.out.println(temp1 + " " + temp2);


        }
    }
}
