package main.programmers.hash;

import java.util.HashMap;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(String st : phone_book){
            map.put(st,count++);
        }
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 1; j < phone_book[i].length(); j++) {
                System.out.println(phone_book[i].substring(0, j));
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        return true;
    }

    public static void main(String[] args) {
        전화번호목록 t = new 전화번호목록();
        System.out.println(t.solution(new String[]{"119", "97674223", "1191924421"}));
        System.out.println(t.solution(new String[]{"123", "456", "124"}));
    }
}
