package main.programmers.level1;

public class Collatz {
    public int solution(int num) {
        int answer = 0;
        while(true){
            if(answer > 500){
                return -1;
            }
            if(num%2 == 0){
              num = num/2;
            }
            else if(num%2==1){
                num = num*3+1;
            }
            answer++;
            if(num == 1){
                return answer;
            }
        }
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        System.out.println("collatz.solution(6) = " + collatz.solution(1));
    }
}
