package main.programmers.fullSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 모음사전 {

    static String[] str = new String[]{"A", "E", "I", "O", "U"};
    static int count = 0;
    static List<String> words = new ArrayList<String>();
    public int solution(String word) {
        int answer=0;
        dfs(0,"");
        for(int i = 0 ;i < words.size() ; i++){
            if(word.equals(words.get(i))){
                answer = i+1;
                break;
            }
        }
        return answer;
    }

    public void dfs(int n, String word){
        for(int i = 0 ; i < str.length;i++){
            words.add(word+str[i]);
            if(n < str.length-1) {
                dfs(n + 1, word + str[i]);
            }
        }
    }

    public static void main(String[] args) {
        모음사전 t = new 모음사전();
        //System.out.println(t.solution("AAAE"));
        System.out.println(t.solution("AAAAE"));
        //System.out.println(t.solution("I"));
    }
}
