package main.programmers.stackQueue;
import java.util.*;
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Stack<Integer> t = new Stack<>();
        Queue<Integer> b = new LinkedList<>();
        for (int i = truck_weights.length - 1; i >= 0; i--) {
            t.push(truck_weights[i]);
        }
        int sum = 0;
        while (!t.isEmpty()) {
            if (!b.isEmpty() && (b.size() + 1) > bridge_length) {
                sum -= b.poll();
            }
            if (!t.isEmpty()) {
                sum += t.peek();
            }

            if (weight < sum) {
                sum -= t.peek();
                answer++;
                b.add(0);
            } else {
                if (!t.isEmpty()) {
                    int a = t.pop();
                    b.add(a);
                }
                answer++;
            }
            //System.out.println(sum);
        }

        //마지막에 다 내보내야 해서 + bridge_length;
        return answer + bridge_length;
    }


    public static void main(String[] args) {
        다리를지나는트럭 t = new 다리를지나는트럭();
        System.out.println("t.solution(2, 10 , new int[]{7,4,5,6}) = " + t.solution(2, 10, new int[]{7, 4, 5, 6}));
    }
}
