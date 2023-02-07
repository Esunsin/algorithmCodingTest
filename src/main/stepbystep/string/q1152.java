package main.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 *       단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * 입력 : 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
 *       단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * input : "The Curious Case of Benjamin Button" / output : 6
 * input : " The Curious Case of Benjamin Button" / output : 6
 * input : "The Curious Case of Benjamin Button " / output : 6
 */
public class q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        if (str.length() == 0) System.out.println(count); //아예 공백시 0으로 출력
        else if (str.length() == 1 && str.charAt(0)==' ') System.out.println(count); // 공백 하나만 있을시 0으로 출력
        else { //나머지는 같은 경우 이다.
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && i != 0 && i != (str.length() - 1)) count++;
            }
            System.out.println(count + 1);
        }
    }
}
