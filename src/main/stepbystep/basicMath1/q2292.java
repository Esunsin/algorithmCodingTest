package main.stepbystep.basicMath1;

import java.util.Scanner;

public class q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int count = 1;
        int sum = 1;
        N = scanner.nextInt();
        if(N==1){
            System.out.println(count);
        }
        else {
            while (true) {
                sum = sum + count * 6;
                if (N <= sum) {
                    break;
                }
                count++;
            }
            System.out.println(count + 1);
        }
    }
}
