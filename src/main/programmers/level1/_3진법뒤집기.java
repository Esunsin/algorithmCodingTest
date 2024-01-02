package main.programmers.level1;

public class _3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        double count = _3자리수(n);
        int[] arr = new int[(int)count];
        for(int i = ((int)count-1) ; i > 0 ; i--){
            arr[i] = n / (int)Math.pow(3,i);
            n = n %(int)Math.pow(3,i);
        }
        for(int i = 0 ; i < count ; i++){
            answer += arr[i]*Math.pow(3,count-1-i);
        }
        return answer;
    }
    private double _3자리수(int n){
        int count = 0;
        double temp = 1;
        while (n > temp){
            count++;
            temp = Math.pow(3,count);
        }
        return count;
    }

    public static void main(String[] args) {
        _3진법뒤집기 s = new _3진법뒤집기();
        System.out.println(s.solution(45));
        System.out.println(s.solution(125));
    }
}
