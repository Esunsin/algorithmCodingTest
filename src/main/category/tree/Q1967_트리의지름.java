package main.category.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1967_트리의지름 {
    static class Node{
        int idx,cnt;
        Node(int idx, int cnt) {
            this.idx = idx;
            this.cnt = cnt;
        }
    }
    static int max = 0;
    static int maxInx = 0;
    static int n;
    static ArrayList<Node> list[];
    static boolean check[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            int weight = sc.nextInt();

            list[parent].add(new Node(child, weight));
            list[child].add(new Node(parent, weight));
        }

        check = new boolean[n + 1];
        check[1] =true;
        dfs(1,0);
        System.out.println(max);
        check = new boolean[n + 1];
        check[maxInx] = true;
        dfs(maxInx, 0);
        System.out.println(max);
    }
    static void dfs(int idx, int cnt) {
        if(max < cnt){
            max = cnt;
            maxInx = idx;
        }
        for (Node node : list[idx]) {
            if(!check[node.idx]){
                check[node.idx] = true;
                dfs(node.idx,cnt + node.cnt);
            }
        }
    }
}
