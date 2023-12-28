package main.programmers.level1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        return sum(left,right);
    }
    int sum(int a,int b){
        int s = 0;
        for(int i = a ; i<=b ;i++){
            if(count(i)%2==0) s+= i;
            else s-=i;
        }
        return s;
    }
    int count(int num){
        int c =0;
        for(int i = 1; i<=num ; i++){
            if(num%i==0) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 a = new 약수의개수와덧셈();
        System.out.println("a.solution(13,17) = " + a.solution(13,17));
    }
}
