package main.programmers.level1;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        String[] tmp1 = new String[cards1.length+1];
        String[] tmp2 = new String[cards2.length + 1];


        int idx1 = 0;
        int idx2 =0;
        for(int i = 0 ; i < goal.length ; i++){
            String temp = goal[i];
            if(idx1<cards1.length&&temp.equals(cards1[idx1])){
                idx1++;
            }
            else if(idx2 < cards2.length&&temp.equals(cards2[idx2]) ){
                idx2++;
            }
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
