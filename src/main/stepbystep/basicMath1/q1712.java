package main.stepbystep.basicMath1;

import java.util.Scanner;

public class q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,k=0;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if( (C-B)!=0 ) {
            int P = A / (C - B);
            if (((C - B) < 0)) System.out.println("-1");
            else System.out.println((P + 1));
        }
        else
            System.out.println("-1");
    }
}
