package main.programmers.level1;

public class PhoneNumberHide{
    public String solution(String phone_number) {
        String answer = "";
        char[] ch = new char[phone_number.length()];
        ch = phone_number.toCharArray();
        for(int i = 0; i< ch.length-4 ;i++){
            ch[i]='*';
        }
        answer = String.copyValueOf(ch);
        return answer;
    }

    public static void main(String[] args) {
        PhoneNumberHide phoneNumberHide = new PhoneNumberHide();
        System.out.println("phoneNumberHide.solution(\"01033334444\") = " + phoneNumberHide.solution("01033334444"));
    }
}
