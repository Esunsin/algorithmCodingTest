package main.swExpertAcademy;

import java.util.Scanner;

public class View {
    class Solution
    {
        public static void main(String args[]) throws Exception
        {

            Scanner sc = new Scanner(System.in);
            int T;
            T=10;
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int answer = 0;
                int t = sc.nextInt();
                int[] b = new int[5];

                b[0] = 0;
                b[1] = 0;
                b[2] = 0;
                b[3] = sc.nextInt();
                b[4] = sc.nextInt();

                for(int i = 0 ; i < t ;i++){
                    int tmp;
                    if(i >= t-2){
                        tmp = 0;
                    }
                    else{
                        tmp = sc.nextInt();
                    }
                    //앞으로 땡기기
                    for(int j = 0 ; j < 4 ; j++){
                        b[j] = b[j+1];
                    }
                    b[4] = tmp;
                    int a = b[2];
                    int max = 0;
                    int maxIdx = 0;
                    //최대값 찾기
                    for(int j = 0 ; j < 5 ; j++){
                        if(max < b[j]) {
                            max = b[j];
                            maxIdx = j;
                        }
                    }
                    if(maxIdx == 2){
                        max = 0;
                        maxIdx =0;
                        for(int j = 0 ; j < 5 ; j++){
                            if(max < b[j] && j != 2) {
                                max = b[j];
                                maxIdx = j;
                            }
                        }
                        //System.out.println("maxIdx = " + maxIdx + " max 2 = " + max);
                        answer += b[2] - b[maxIdx];
                    }
                    //System.out.println( "i = " +i+ ", answer = " + answer);
                }


                System.out.println("#" + test_case + " " + answer);
            }
        }
    }
}
