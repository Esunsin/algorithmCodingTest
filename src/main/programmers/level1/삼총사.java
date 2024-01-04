package main.programmers.level1;

public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;
        for (int i = 0; i < n-2; i++) {
            for(int j = i+1 ; j < n-1 ; j++){
                for(int k = j+1 ; k< n ; k++) {
                    if (0 == number[i] + number[j] + number[k]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        삼총사 s = new 삼총사();
        System.out.println(s.solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println(s.solution(new int[]{-3, -2,-1, 0, 1, 2, 3}));
    }
}
