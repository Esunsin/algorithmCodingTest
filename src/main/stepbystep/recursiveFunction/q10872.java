package main.stepbystep.recursiveFunction;

import java.util.Scanner;

public class q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N>1)
            System.out.println(factorial(N));
        else
            System.out.println(1);
    }

    public static int factorial(int N){
        if(N<2){
            return N;
        }
        int t = factorial(N - 1);

        return N*t;

    }
}
