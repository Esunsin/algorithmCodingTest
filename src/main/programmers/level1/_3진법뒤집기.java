package main.programmers.level1;

public class _3진법뒤집기 {
    public int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
    }


    public static void main(String[] args) {
        _3진법뒤집기 s = new _3진법뒤집기();
        System.out.println(s.solution(45));
        System.out.println(s.solution(125));
        System.out.println(s.solution(9));
    }
}
