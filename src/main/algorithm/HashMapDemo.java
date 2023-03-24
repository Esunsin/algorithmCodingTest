package main.algorithm;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap(); // 타입 설정x Object 입력
        HashMap<Integer, Integer> i = new HashMap<>(); // Integer, Integer 타입 설정
        HashMap<Integer, Integer> i2 = new HashMap<>(i); // i의 값을 i2에 카피
        HashMap<Integer, Integer> i3 = new HashMap<>(10); // 초기용량 지정
        HashMap<Integer, Integer> i4 = new HashMap<>() {{ // 변수 선언 + 초기값 지정
            put(1, 100);
            put(2, 200);
        }};

        HashMap<String, String> str = new HashMap<String, String>(); // String, String 타입 설정
        HashMap<Character, Character> ch = new HashMap<Character, Character>(); // Char, Char 타입 설정

        HashMap<Integer, Integer> test = new HashMap<>();
        //값 추가
        test.put(1, 1000);
        test.put(2, 1000);
        test.put(3, 2134);
        System.out.println("test = " + test);
        //값 삭제
        test.remove(2);
        System.out.println("test = " + test);
        //크기
        System.out.println("test.size() = " + test.size());

    }
}
