package main.stepbystep.basicMath1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int height = 0;
        int A;
        int B;
        int V;
        String s = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        A = Integer.parseInt(stringTokenizer.nextToken());
        B = Integer.parseInt(stringTokenizer.nextToken());
        V = Integer.parseInt(stringTokenizer.nextToken());

        int day = (V - B) / (A - B);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if( (V - B) % (A - B) != 0 ) {
            day++;
        }
        System.out.println(day);

    }
}
