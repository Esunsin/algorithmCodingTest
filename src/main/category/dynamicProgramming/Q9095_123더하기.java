package main.category.dynamicProgramming;

import java.util.Scanner;

public class Q9095_123더하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result;
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        for(int i = 0 ; i< N ;i++){
            result = 1;
            num[0] = 1;
            num[1] = 2;
            num[2] = 3;//초기화
            int K = scanner.nextInt();

            if(K==1){
            }
            else if(K <= 4){
                for(int j = 0;j<K-1;j++){
                    result = result + num[j];
                }
            }
            else if(K == 5){
                result = 13;
            }
            else{
                result = 13;
                int m = K - 5;
                for (int j = 0; j < m; j++) {
                    int temp = num[0]+num[1]+num[2];
                    num[0]=num[1];
                    num[1] = num[2];
                    num[2] = temp;
                    result = result + num[0] + num[1] + num[2];
                }


            }
            System.out.println("result = " + result);
        }
    }
}
