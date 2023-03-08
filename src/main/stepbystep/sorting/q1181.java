package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = bufferedReader.readLine();
        }
        //정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);    // 사전 순 정렬
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(str[0]);

        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!str[i].equals(str[i - 1])) {
                System.out.println(str[i]);
            }
        }
    }
}
