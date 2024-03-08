package main.programmers.level1;

public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE}; // {외쪽, 위 , 오른쪽 , 아래}

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    answer[0] = Math.min(answer[0], r);
                    answer[1] = Math.min(answer[1], c);
                    answer[2] = Math.max(answer[2], r);
                    answer[3] = Math.max(answer[3], c);
                }
            }
        }
        answer[2]++;
        answer[3]++;

        return answer;
    }
}
