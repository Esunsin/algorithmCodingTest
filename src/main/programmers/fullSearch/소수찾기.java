package main.programmers.fullSearch;

import java.util.ArrayList;
import java.util.HashSet;

public class 소수찾기 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7];

    public int solution(String numbers) {
        int answer = 0;
        for(int i=0; i<numbers.length(); i++){
            dfs(numbers,"",i+1);
        }

        for(int i=0; i<arr.size(); i++){
            if(isPrime(arr.get(i))) answer++;
        }

        return answer;

    }
    //백트래킹
    static void dfs(String str, String temp, int m) {
        if(temp.length() == m){
            int num = Integer.parseInt(temp);
            if(!arr.contains(num)){
                arr.add(num);
            }
        }

        for(int i=0; i<str.length(); i++){
            if(!check[i]){
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length()-1);
            }
        }

    }

    public boolean isPrime(int N){
        if(N < 2) return false;
        for(int i = 2; i<(int)Math.sqrt(N);i++){
            if(N%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        소수찾기 T = new 소수찾기();
        System.out.println(T.solution("17"));
    }
}
