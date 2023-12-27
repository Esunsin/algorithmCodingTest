package main.programmers.level1;

public class SumBetweenIntegers {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        while(a<=b){
            answer += a;
            a++;
        }
        return answer;
    }

    public static void main(String[] args) {
        SumBetweenIntegers sumBetweenIntegers = new SumBetweenIntegers();
        System.out.println("sumBetweenIntegers.solution(3,5) = " + sumBetweenIntegers.solution(5,3));
    }
}
