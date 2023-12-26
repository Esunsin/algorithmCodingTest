package main.swExpertAcademy;

import java.util.Scanner;

public class D3_원안의점 {
    class Solution
    {
        public static void main(String args[]) throws Exception
        {

            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int N = sc.nextInt();
                int count = 0;
                /////////////////////
                for(int i = 1 ; i < N ; i++){
                    for(int j = 1 ; j < N ; j++){
                        if((N*N) >= (i*i)+(j*j)) count++;
                    }
                }
                count = count*4;
                count += 1+4+(N-1)*4;
                /////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("#" + test_case + " " + count);
            }
        }
    }
}
