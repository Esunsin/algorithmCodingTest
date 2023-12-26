package main.programmers.level1;

public class 배열의평균값 {
        public static double solution(int[] numbers) {
            double answer = 0;
            for (int number : numbers) {
                answer += (double)number;
            }
            answer = answer/ numbers.length;
            return answer;
        }


    public static void main(String[] args) {
        배열의평균값 s = new 배열의평균값();
        System.out.println(" = " + 배열의평균값.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
