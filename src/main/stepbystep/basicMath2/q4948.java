package main.stepbystep.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count,output;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){//종료 조건
                break;
            }
            output = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                count = 0;
                for(int j = 2;j <= Math.sqrt(i);j++){
                    if(i%j == 0){
                        count++;
                        break;
                    }
                }
                if(count == 0) {
                    output++;
                }
            }
            System.out.println(output);
        }
    }
}
