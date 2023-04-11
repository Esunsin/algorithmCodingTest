package main.programmers.stackQueue;

import java.util.Stack;

public class 주식가격 {
    public int[] arrSolution(int[] prices) {
        int siz = prices.length;
        int[] answer = new int[siz];
        for(int i = 0 ; i < siz ; i++){
            int count = 0;
            for(int j = i ; j < siz ; j++){
                if(prices[i] > prices[j]) {
                    count++;
                    break;
                }
                count++;
            }
            answer[i] = count-1;
        }
        answer[siz - 1] = 0;
        return answer;
    }
    public int[] stackSolution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();  // 답을 구했기 때문에 stack에서 제거
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) { // 값을 구하지 못한 index == 끝까지 가격이 떨어지지 않은 주식
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }

}
