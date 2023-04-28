package main.programmers.fullSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class 소수찾기 {
    static boolean[] check;
    static String[] split;
    static HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        split = numbers.split("");
        check = new boolean[split.length];
        dfs(0,"");
        int count = 0;
        for (Integer integer : set) {
            if(isPrime(integer)){
                System.out.println("integer = " + integer);
                count++;
            }
        }
        return count;
    }

    static void dfs(int depth,String cur){
        if(depth >split.length) return;

        for(int i=0;i< split.length;i++){
            if(!check[i]){
                check[i]=true;
                set.add(Integer.valueOf(cur+split[i]));
                dfs(depth+1,cur+split[i]);
                check[i]=false;
            }
        }
    }

    public boolean isPrime(int N){
        if(N < 2) return false;
        for(int i = 2; i<N;i++){
            if(N%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        소수찾기 T = new 소수찾기();
        System.out.println(T.solution("53"));
    }
}
