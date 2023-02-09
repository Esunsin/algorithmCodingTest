package main.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int minTime=0;
        for(int i = 0; i < s.length() ; i++){
            if('Z'>=s.charAt(i)&&s.charAt(i) >= 'W') minTime+=10;
            else if(s.charAt(i) >= 'T') minTime+=9;
            else if (s.charAt(i) >= 'P') minTime+=8;
            else if(s.charAt(i) >= 'M') minTime+=7;
            else if (s.charAt(i) >= 'J') minTime+=6;
            else if (s.charAt(i) >= 'G') minTime+=5;
            else if (s.charAt(i) >= 'D') minTime+=4;
            else if (s.charAt(i) >= 'A') minTime+=3;
            else minTime+=2;
        }
        System.out.println("minTime = " + minTime);
    }
}
