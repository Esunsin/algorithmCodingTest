package main.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodFightCompetition {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> result = new ArrayList<>();
        result.add(0);
        int foodTypeCount = food.length;
        for(int i =foodTypeCount-1 ; i>0 ; i--){
            for(int j = 1 ; j <= food[i]/2 ; j++){
                result.add(i);
            }
        }
        List<Integer> temp = new ArrayList<>();
        temp.addAll(result);
        Collections.sort(temp);

        for (Integer integer : temp) {
            answer += String.valueOf(integer);
        }
        for (Integer integer : result) {
            answer += String.valueOf(integer);
        }
        answer = answer.substring(1);
        return answer;
    }

    public static void main(String[] args) {
        FoodFightCompetition foodFightCompetition = new FoodFightCompetition();
        System.out.println(foodFightCompetition.solution(new int[]{1, 3, 4, 6}));
    }
}
