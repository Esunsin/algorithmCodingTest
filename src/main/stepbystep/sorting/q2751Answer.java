package main.stepbystep.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Tim Sort(merge sort + insert sort)를 이용하여 정렬 : Collection.sort
 */
public class q2751Answer {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(list);
        for (Integer value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
