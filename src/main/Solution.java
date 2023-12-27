package main;

import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution

{
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String temp = new String();
        for(int i = ch.length-1 ; i >= 0;i--){
            temp += ch[i];
        }
        answer = Long.valueOf(temp);
        return answer;
    }

    public static void main(String args[]) throws Exception
    {
        Solution solution = new Solution();


    }

}