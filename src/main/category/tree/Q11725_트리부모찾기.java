package main.category.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11725_트리부모찾기 {

    static int N;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        list = new ArrayList[N+1];
        parents = new int[N + 1];
        check = new boolean[N + 1];

        for(int i = 1; i <= N ;i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i = 1; i < N ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }
        for (int i = 1; i <= N; i++) {
            if(!check[i]) dfs(i);
        }
        for(int i = 2;i <= N;i++){
            System.out.println(parents[i]);
        }

    }
    static void dfs(int v){
        if(check[v]){
            return;
        }
        check[v] = true;
        for (Integer integer : list[v]) {
            if (!check[integer]) {
                parents[integer] = v;
                dfs(integer);
            }
        }
    }
}
