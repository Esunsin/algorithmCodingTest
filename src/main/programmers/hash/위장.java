package main.programmers.hash;

import java.util.HashMap;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i< clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        int sum = 1;

        for(String st:map.keySet()){
            //System.out.println(st + " : " + map.get(st));
            sum *=(map.get(st) + 1);
            //System.out.println(sum);
        }
        answer = sum - 1;
        return answer;
    }

    public static void main(String[] args) {
        위장 T = new 위장();
        System.out.println(T.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    }
}
