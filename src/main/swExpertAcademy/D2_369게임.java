package main.swExpertAcademy;


import java.util.Scanner;

public class D2_369게임 {
    class Solution
    {
        static int q = 0;
        public void main(String args[]) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            Solution T = new Solution();
            int k = sc.nextInt();
            for(int i = 1 ; i <= k ; i++){
                q=0;
                int a = T.dfs(i);
                if(a == 0){
                    System.out.print(i + " ");
                }
                else{
                    while(a > 0){
                        System.out.print("-");
                        a--;
                    }
                    System.out.print(" ");
                }

            }
        }
        public int dfs(int n){
            if (n > 0) {
                int tmp1 = n / 10;
                int tmp2 = n % 10;
                if (tmp2 % 3 == 0 && tmp2 != 0) {
                    q++;
                }
                dfs(tmp1);
            }
            return q;
        }
    }
}
