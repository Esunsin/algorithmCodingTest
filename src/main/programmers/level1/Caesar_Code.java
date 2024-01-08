package main.programmers.level1;

public class Caesar_Code {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length;i++){
            if((chars[i] >= 'a' &&  chars[i] <= 'z') ||(chars[i] >= 'A'&&chars[i] <='Z')){
                chars[i] = moveAlphabet(chars[i], n);
            }
            answer+=chars[i];
        }

        return answer;
    }
    private char moveAlphabet(char ch,int n){
        int temp = ch + n;
        if(temp > 90 && ch <= 90){
            temp -= 26;
        }
        if(temp > 122) temp -=26;

        return (char) temp;
    }

    public static void main(String[] args) {
        Caesar_Code caesar_code = new Caesar_Code();
        System.out.println(caesar_code.solution("ABCDEFGHIJKLMNOPQRSTUVWXYZ",25));
    }
}
