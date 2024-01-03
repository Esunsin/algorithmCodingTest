package main.programmers.level1;

public class IsCharacter {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        for(char c : ch){
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IsCharacter isCharacter = new IsCharacter();
        System.out.println(isCharacter.solution("3212"));
        System.out.println(isCharacter.solution("7654321"));
    }
}
