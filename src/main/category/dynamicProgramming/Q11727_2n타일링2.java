package main.category.dynamicProgramming;

import java.util.Scanner;

public class Q11727_2n타일링2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[2];
        num[0] = 1;
        num[1] = 3;
        int N = scanner.nextInt();
        for (int i = 2; i < N; i++) {
            int temp = (num[0]*2)%10007 + num[1]%10007;
            num[0] = num[1]%10007;
            num[1] = temp;
        }
        if(N == 1){
            System.out.println(num[0]%10007);
        }
        else {
            System.out.println(num[1]%10007);
        }
    }
}
