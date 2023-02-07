package main.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//노가다 풀이 -> 아스키코드로 변경시 더 효과적일 거 같음 or 토큰 StringTokenizer으로 토큰화
public class q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] s = str.split(" ");
        int first = Integer.parseInt(s[0]);
        int second = Integer.parseInt(s[1]);
        //System.out.println("first = " + first);
        //System.out.println("second = " + second);
        int a = first/100;
        int b = (first/10)%10;
        int c = first%10;
        int num1 = c*100 + b*10 + a;
        int d = second/100;
        int e = (second/10)%10;
        int f = second%10;
        int num2 = f*100 + e*10 + d;
        if(num1 > num2) System.out.println(num1);
        else System.out.println(num2);
    }

}
