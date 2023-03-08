package main.stepbystep.recursiveFunction;

import java.util.Scanner;

public class q10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("fibonacci(N) = " + fibonacci(N));
    }

    public static int fibonacci(int N){
        if(N < 2){
            return N;
        }
        return fibonacci(N-1)+fibonacci(N-2);
    }
}
