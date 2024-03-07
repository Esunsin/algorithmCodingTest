package main.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> li = new ArrayList<>();

        for(int i :ingredient) {
            li.add(i);
            while(li.size() >= 4) {
                int n = li.size();
                if(!(li.get(n-1) == 1
                        && li.get(n-2)==3
                        && li.get(n-3) ==2
                        && li.get(n-4)==1)) break;
                for(int j=0; j<4; j++) {
                    li.remove(li.size() -1);
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        햄버거만들기 s = new 햄버거만들기();
        System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(new int[]{1,3,2,1,2,1,3,1,2}));

    }
}
