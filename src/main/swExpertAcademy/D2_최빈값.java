package main.swExpertAcademy;

import java.util.HashMap;
import java.util.Scanner;

public class D2_최빈값 {
    class Solution
    {
        public static void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int t = sc.nextInt();
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int i = 0 ; i < 1000 ; i++){
                    int num = sc.nextInt();
                    map.put(num,map.getOrDefault(num,0)+1);
                }
                int max = 0;
                int answer = 0;
                for (Integer integer : map.keySet()) {
                    if(max <= map.get(integer)){
                        max = map.get(integer);
                        answer = integer;
                    }
                }
                System.out.println("#" + test_case + " " + answer);

            }
        }
    }
}
