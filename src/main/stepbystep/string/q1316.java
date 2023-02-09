package main.stepbystep.string;

import java.util.Scanner;

public class q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[26];
        int count = N;
        initNum(num);
        for (int i = 0; i < N; i++) {
            String s = sc.next();
                for (int j = 0; j < s.length(); j++) {
                    int k = s.charAt(j) - 'a';
                    if (num[k] == 0) {
                        num[k] = 1;
                    } else if (num[k] == 1 && j>0) {
                        if(s.charAt(j) == s.charAt(j-1)){
                            continue;
                        }
                        else{
                            count--;
                            break;
                        }
                    }
                }
            initNum(num);

        }
        System.out.println(count);
    }
    static void initNum(int[] num){
        for(int i = 0 ; i<num.length;i++){
            num[i] = 0;
        }
    }
}
