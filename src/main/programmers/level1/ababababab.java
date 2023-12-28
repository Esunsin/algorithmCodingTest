package main.programmers.level1;

public class ababababab {
    public String solution(int n) {
        String answer = "";
        for(int i = 1;i<=n;i++){
            if(i%2==1){
                answer += "수";
            }
            else{
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ababababab ababababab = new ababababab();
        System.out.println("ababababab.solution(3) = " + ababababab.solution(3));
    }
}
