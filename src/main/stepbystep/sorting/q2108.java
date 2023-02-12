package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(N == 1){
            System.out.println(arr[0]);
            System.out.println(arr[0]);
            System.out.println(arr[0]);
            System.out.println(0);
        }
        else
        {
            System.out.println(avg(arr));
            System.out.println(mid(arr));
            System.out.println(frequentValue(arr,4000));
            System.out.println(maxMin(arr));

        }
    }
    static int avg(int[] arr){
        int sum = 0;
        int temp ;
        for(int i = 0 ; i< arr.length;i++){
            sum += arr[i];

        }
        double a = (double)sum/ arr.length;
        if(a >= 0){
            temp = (int)(a+0.5);
            //System.out.println("temp = " + temp);
        }
        else{
            temp = (int) (a - 0.5);
            //System.out.println("temp = " + temp);
        }
        return temp;

    }
    static int mid(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    static int frequentValue(int[] arr,int size){
        int[] count = new int[size*2+1];
        Arrays.fill(count, 0);
        for(int i = 0;i < arr.length;i++){//counting
            count[arr[i]+size]++;
        }
        int max = 0;
        int check = 0;
        for(int i = 0 ;i < count.length;i++){ //제일 많이 나온 숫자의 개수구하기
            if(max < count[i]) {
                max = count[i];
                check = i;
            }
        }
        for(int i = 0;i< count.length;i++){
            if(max == count[i] && check != i){
                check = i;
                break;
            }
        }
        return check-4000;

    }
    static int maxMin(int[] arr){
        int max =arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        return max - min;
    }
}
