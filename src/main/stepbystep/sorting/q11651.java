package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q11651 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        //merge 정렬 할때 2번째 인자까지 확인하는 것이기 때문에
        Arrays.sort(arr, (e1,e2) -> {
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            }
            else
                return e1[1]-e2[1];
        });
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
