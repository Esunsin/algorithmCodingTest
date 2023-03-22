package main.category.dynamicProgramming;

import java.util.Scanner;

public class Q11726_2n타일링 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[2];
        num[0] = 1;
        num[1] = 2;
        int N = scanner.nextInt();
        for (int i = 2; i < N; i++) {
            int temp = num[0]%10007 + num[1]%10007;
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
