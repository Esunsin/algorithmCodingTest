package main.programmers.level1;

import java.util.Map;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        int answer = 0;
        String answerToString = "";
        String str = "";
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        char[] tmp = s.toCharArray();
        for(int i = 0;i<tmp.length;i++){
            if(tmp[i] <'0' || tmp[i] >'9'){
                str += tmp[i];
                answerToString += toNumber(number, str);
                if(toNumber(number,str) != "") str = "";
            }
            else answerToString += tmp[i];
        }
        answer = Integer.valueOf(answerToString);
        return answer;
    }
    private String toNumber(String[] number,String s){
        String tmp = "";
        for(int i = 0 ; i < 10 ; i++){
            if(number[i].equals(s)) tmp = i+"";
        }

        return tmp;
    }

    public static void main(String[] args) {

        숫자문자열과영단어 s = new 숫자문자열과영단어();
        System.out.println(s.solution("23four5six7"));

    }
}
