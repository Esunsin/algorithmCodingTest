package main;

import java.util.*;

public class 과일예제윈도우슬라이드알고리즘 {
    public int[] solution3(int[] fruits, int k) {
        Set<Integer> maxScore = new HashSet<>(); //중복 제외
        int n = fruits.length;
        int max = 0;
        for (int i = 0; i < k; i++) { // 초기 가장 무거운 과일의 무게 찾기
            max = Math.max(max, fruits[i]);
        }
        maxScore.add(max);

        for (int i = k; i < n; i++) { // 이동하면서 최대값 찾기
            if (fruits[i - k] == max) { // 제외되는 과일이 최대값인 경우
                max = 0;
                for (int j = i - k + 1; j <= i; j++) { // 다시 가장 무거운 과일의 무게 찾기
                    max = Math.max(max, fruits[j]);
                }
            } else { //제외되는 과일이 최대값이 아닌 경우
                max = Math.max(max, fruits[i]);
            }
            maxScore.add(max); // 최대값으로 가능한 최대 점수 추가
        }
        int[] answer = new int[maxScore.size()];
        int idx = 0;
        //저장
        Iterator<Integer> iter = maxScore.iterator();
        while(iter.hasNext()){
            answer[idx] = iter.next();
            System.out.println(answer[idx]);
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }

    static HashMap<String,Integer> name = new HashMap<>();
    public String[] solution(int[] s_one,String[] n_one,int[] s_two,String[] n_two,int[] s_three,String[] n_three) {
        step(s_one, n_one);
        step(s_two, n_two);
        step(s_three, n_three);
        String[] answer = new String[name.size()];
        int i = 0;
        while (!name.isEmpty()) {
            int maxVal = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : name.entrySet()) {
                if (entry.getValue() > maxVal) {
                    maxVal = entry.getValue();
                    answer[i] = entry.getKey();
                }
            }
            name.remove(answer[i],maxVal);
            System.out.println(answer[i] + " " + maxVal);
            i++;

        }

        return answer;
    }
    public void step(int[] steps,String[] names){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < steps.length; i++){
            if(!map.containsKey(names[i])) {
                map.put(names[i], steps[i]);
            }
            else{
                if(map.get(names[i]) < steps[i]){
                    map.put(names[i],steps[i]);
                }
            }
        }
        for (String s : map.keySet()) {
            name.put(s,name.getOrDefault(s,0)+map.get(s));
        }
    }

    public static void main(String[] args) {
        과일예제윈도우슬라이드알고리즘 t = new 과일예제윈도우슬라이드알고리즘();
        System.out.println(t.solution3(new int[]{30,40,10,20,30},3));
        System.out.println(t.solution(new int[]{1,2,3},new String[]{"jjj","bbb","aaa"},new int[]{10,20,30},new String[]{"jjj","aaa","bbb"},new int[]{1000,1,1},new String[]{"bbb","aaa","jjj"}));
        System.out.println(t.solution(new int[]{0,5,1},new String[]{"evan","ed","evan"},new int[]{9999},new String[]{"rose"},new int[]{1},new String[]{"richard"}));
    }
}
