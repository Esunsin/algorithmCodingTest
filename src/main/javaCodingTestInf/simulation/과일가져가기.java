package main.javaCodingTestInf.simulation;

import java.util.*;
class 과일가져가기 {
    public int solution(int[][] fruit){
        int answer = 0;
        int minIdx = 0;
        int minIdx2 = 0;
        int count = 0;
        boolean[] check = new boolean[fruit.length];
        for (int i = 0; i < fruit.length; i++) {
            int min = fruit[i][0];
            for(int j = 1 ; j < fruit[i].length ; j++){
                if(min == fruit[i][j]){
                    check[i] = true;
                }
                if (min > fruit[i][j]) {
                    min = fruit[i][j];
                }
            }
        }
        for( int j = 0 ; j < fruit.length ; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < fruit[j].length; i++) {
                if (min > fruit[j][i]) {
                    min = fruit[j][i];
                    minIdx = i;
                }
            }
            for (int i = 0; i < fruit.length; i++) {
                int min2 = Integer.MAX_VALUE;
                if(j == i) continue;
                for (int k = 0; k < fruit[j].length; k++) {
                    if (min2 > fruit[i][k]) {
                        min2 = fruit[i][k];
                        minIdx2 = k;
                    }
                }
                int a = fruit[j][minIdx]+1;
                int b = fruit[i][minIdx]-1;
                int c = fruit[i][minIdx2]+1;
                int d = fruit[j][minIdx2]-1;
                if(minIdx2 != minIdx && check[i] == false && check[j]==false && a <= d && b >= c){
                    fruit[j][minIdx]++;
                    fruit[i][minIdx]--;
                    fruit[i][minIdx2]++;
                    fruit[j][minIdx2]--;
                    check[i] = true;
                    //System.out.println("minIdx = " + minIdx + " minIdx2 = " + minIdx2 +" j = " + j+ " check["+j+"] = " + check[j] + " i = " + i + " check["+i+"] = " + check[i]);
                    break;
                }

            }
            //System.out.println(" ================== ");
            check[j]=true;
        }

        for(int i = 0 ; i < fruit.length ; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < fruit[i].length; j++) {
                if (min > fruit[i][j]) {
                    min = fruit[i][j];
                }
            }
            //System.out.println("fruit = " + Arrays.toString(fruit[i]));
            answer += min;
        }
        return answer;
    }

    public static void main(String[] args){
        과일가져가기 T = new 과일가져가기();
        System.out.println(T.solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
        System.out.println(T.solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));
        System.out.println(T.solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
        System.out.println(T.solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
    }
}