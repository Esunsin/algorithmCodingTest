package main.stepbystep.string;

import java.util.Scanner;

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 * input : Mississipi/ zZa
 * output : ? / Z
 */
public class q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 영문자의 개수
        String str = sc.next();
        int i, max;
        for(i=0;i<str.length();i++){
            if(65 <= str.charAt(i)&&str.charAt(i)<=90) //대문자 범위 65 ~ 90
                arr[str.charAt(i)-'A']++;
            else //소문자 범위 97~122
                arr[str.charAt(i)-'a']++;
        }
        max = -1;
        char ch = '?';
        for (i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i+'A');
            }
            else if(arr[i] == max){
                ch ='?';
            }
        }
        System.out.println(ch);
    }
}
