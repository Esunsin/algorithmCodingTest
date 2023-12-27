package main.programmers.level1;

public class MiddleNumber {
    public String solution(String s) {
        String answer = "";
        int count = s.length();
        if(count%2==1){
            char[] ch = new char[s.length()];
            ch = s.toCharArray();
            answer += ch[count/2];
        }
        else{
            char[] ch = new char[s.length()];
            ch = s.toCharArray();
            answer = ""+ch[count/2] + ch[count/2-1];
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
