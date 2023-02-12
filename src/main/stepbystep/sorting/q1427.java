package main.stepbystep.sorting;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a;
        int count = 0 ;
        StringBuilder stringBuilder = new StringBuilder();
        while(b > 0){
            b = b/10;
            count++;
        }
        int index = 0;
        Integer[] arr = new Integer[count];
        while(a>0){
            arr[index] = a%10;
            a = a/10;
            index++;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            stringBuilder.append(arr[i]);
        }
        System.out.println(stringBuilder);
    }
}
