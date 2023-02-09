package main.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(i>1) {
                if (s.charAt(i) == '=' && s.charAt(i - 1) == 'z' && s.charAt(i-2) == 'd') count--;
            }

            if(i>0) {
                if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                    count++;
                    if ((s.charAt(i - 1) == 'l' && s.charAt(i) == 'j') || (s.charAt(i - 1) == 'n' && s.charAt(i) == 'j'))
                        count--;
                }
            }
            else count++;
        }
        System.out.println(count);
    }
}
