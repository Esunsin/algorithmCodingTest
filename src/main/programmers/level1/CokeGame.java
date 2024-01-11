package main.programmers.level1;

public class CokeGame {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int p = 0;
            int q = 0;
            p = (n/a)*b;
            q = n%a;
            answer += p;
            n = p+q;
        }
        return answer;
    }

    public static void main(String[] args) {
        CokeGame cokeGame = new CokeGame();
        System.out.println("cokeGame = " + cokeGame.solution(2, 1, 20));
        System.out.println("cokeGame = " + cokeGame.solution(3, 1, 20));
    }
}
