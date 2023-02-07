package main.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2908Answer { //StringTokenizer
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int[] num = new int[2];
        for (int i = 0; i < 2; i++) {
            String temp = stringTokenizer.nextToken();
            num[i] = (temp.charAt(2)-'0')*100 + (temp.charAt(1)-'0')*10 + (temp.charAt(0)-'0');
        }
        System.out.println(num[0]>num[1] ? num[0]:num[1]);

    }
}
