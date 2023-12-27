package main.programmers.level1;

public class KimFind {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(int i = 0 ; i < seoul.length ; i++){
            if(seoul[i].equals("Kim")){
                index = i;
                break;
            }
        }
        answer = "김서방은 " + index+"에 있다";
        
        return answer;
    }

    public static void main(String[] args) {
        KimFind kimFind = new KimFind();
        System.out.println("kimFind.solution(new String[]{\"jane\", \"Kim\"}) = " + kimFind.solution(new String[]{"jane", "Kim"}));
    }
}
