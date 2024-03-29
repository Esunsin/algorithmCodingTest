package main.stepbystep.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();

        }
        //merge 정렬 할때 2번째 인자까지 확인하는 것이기 때문에
        Arrays.sort(arr, (e1,e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }
            else
                return e1[0]-e2[0];
        });
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
