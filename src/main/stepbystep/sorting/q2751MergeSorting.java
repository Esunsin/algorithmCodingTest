package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 메모리 초과 -> merge sort는 데이터 크기만한 메모리가 더 필요함 + 퀵 정렬보다 성능이 떨어짐
 */
public class q2751MergeSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = Integer.parseInt(bufferedReader.readLine());
        }
        mergeSort(n , 0 , N-1);
        for (int i = 0; i < N; i++) {
            System.out.println(n[i]);
        }
    }

    static void mergeSort(int[] a,int start, int end) {
        int[] temp = new int[a.length];
        int p = start;
        int mid = (start + end)/2;
        int q = mid + 1;
        int index = p;
        if(start >= end) { // 재귀 종료 조건
            return;
        }
            mergeSort(a, start, mid);
            mergeSort(a, q, end);
        while (p <= mid && q <= end) {
            if(a[p] < a[q]){
                temp[index++] = a[p++];
            }
            else{
                temp[index++] = a[q++];
            }
        }
        if(p > mid){
            while(q<=end)
                temp[index++] = a[q++];
        }
        if(q > end){
            while(p<=mid)
                temp[index++] = a[p++];
        }
        for(int i =start;i<=end;i++){
            a[i] = temp[i];
        }

    }
}
