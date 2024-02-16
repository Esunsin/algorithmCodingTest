package main.programmers.level1;

public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }

        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        기사단원의무기 a = new 기사단원의무기();
        //System.out.println("a.solution(5,3,2) = " + a.solution(100000, 100, 100));
        System.out.println("a.solution(10,3,2) = " + a.solution(10, 3, 2));
    }
}
