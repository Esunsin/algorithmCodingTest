package main.programmers.level1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int size = section.length;
        boolean[] wall = new boolean[n];
        for (int num : section) {
            wall[num-1] = true;
        }
        for(int i = 0 ; i < n - m ; i++){
            if(wall[i] == true){
                for(int j = i ; j < m ;j++){
                    wall[j] = false;
                }
                answer++;
            }
        }
        for(int i = n-m;i<n;i++){
            if(wall[i] == true){
                answer++;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        덧칠하기 s = new 덧칠하기();
        System.out.println(s.solution(8, 4, new int[]{2,3,6}));
    }
}
