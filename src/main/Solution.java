package main;

import java.lang.String;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution

{
    public Integer[] solution(long n) {
        String str = String.valueOf(n);
        System.out.println("str = " + str);
        Integer[] answer = new Integer[str.length()];
        for(int i = 0 ; i < str.length() ; i++){
            System.out.println("str = " + str);
        }
        return answer;
    }
    public static void main(String args[]) throws Exception
    {
        Solution solution = new Solution();
        Integer[] n  = solution.solution(123456789);

    }

}