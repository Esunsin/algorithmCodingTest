package main.swExpertAcademy;

import java.util.Scanner;

public class D2_달팽이 {
    /*
       사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
       이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
     */
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
                int k = sc.nextInt();
                int[][] arr = new int[k][k];
                int[] dx = {1,0,-1,0};
                int[] dy = {0,1,0,-1};
                int x=0,y=0,q=0;
                arr[x][y] = 1;

                /////////////////////////////////////////////////////////////////////////////////////////////
                for(int i = 2 ; i <= k*k ; i++){
                    int tx = x + dx[q];
                    int ty = y + dy[q];
                    if(tx > k -1 || ty > k-1 || tx < 0 || ty < 0 || arr[ty][tx] > 0){
                        q = (q+1)%4;
                        tx = x + dx[q];
                        ty = y + dy[q];
                    }
                    arr[ty][tx] = i;
                    x = tx;
                    y = ty;
                }
                /////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("#" + test_case);
                for(int i = 0 ; i < k ; i++){
                    for(int j = 0 ; j < k ; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
