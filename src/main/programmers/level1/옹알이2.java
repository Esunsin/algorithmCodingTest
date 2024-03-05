package main.programmers.level1;

public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String b : babbling){
            if (b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("maamaa")) {
                continue;
            }
            b = b.replace("aya", " ");
            b = b.replace("ye", " ");
            b = b.replace("woo", " ");
            b = b.replace("ma", " ");
            b = b.replace(" ", "");

            if(b.isEmpty()) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        옹알이2 s = new 옹알이2();
        System.out.println(s.solution(new String[]{"yeayayeayayewoo"}));
    }
}
