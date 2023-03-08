package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q18870TimeOut {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] e = new int[N],temp = new int[N],result = new int[N];
        for (int i = 0; i < N; i++) {
            e[i] = Integer.parseInt(stringTokenizer.nextToken());
            temp[i] = e[i];
        }
        int[] removeDuplicates = removeDuplicates(e);
        integerSort(removeDuplicates);
        for (int i = 0; i < removeDuplicates.length; i++) {
            for(int j = 0 ; j < N ; j++){
                if(removeDuplicates[i] == temp[j]){
                    result[j] = i;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }


    }
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
    public static void integerSort(int[] arr) {
        Arrays.sort(arr);
    }
    public static void arrPrint(int[] arr) {
        for(int i = 0 ; i < arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}
