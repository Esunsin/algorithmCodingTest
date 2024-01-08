package main.programmers.level1;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        long pNumber = longToString(p);
        for(int i = 0 ; i < t.length()-p.length() + 1 ; i++){
            long tNumber = longToString(t.substring(i, i + p.length()));
            if(pNumber >= tNumber) answer++;
        }

        return answer;
    }
    private long longToString(String str){
        return Long.valueOf(str);
    }

    public static void main(String[] args) {
        크기가작은부분문자열 s = new 크기가작은부분문자열();
        System.out.println(s.solution("3141592", "2711234"));
    }
}
