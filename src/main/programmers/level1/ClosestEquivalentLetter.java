package main.programmers.level1;

public class ClosestEquivalentLetter {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                answer[i] = -1;
            } else {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] == arr[j]) {
                        answer[i] = i - j;
                        break;
                    } else
                        answer[i] = -1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ClosestEquivalentLetter closestEquivalentLetter = new ClosestEquivalentLetter();
        System.out.println("closestEquivalentLetter.solution(\"banana\") = " + closestEquivalentLetter.solution("foobar"));
    }
}
