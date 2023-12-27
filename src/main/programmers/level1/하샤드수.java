package main.programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        char[] ch = str.toCharArray();
        int[] nums = new int[ch.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ch[i]-'0';
            sum +=nums[i];
        }
        if(x%sum==0)
            return answer;
        else
            return false;
    }

    public static void main(String[] args) {
        하샤드수 s = new 하샤드수();
        System.out.println("s.solution(12) = " + s.solution(12));
    }
}
