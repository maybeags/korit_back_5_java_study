package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("username", "junil");
        map.put("password", "1234");
        map.put("name", "김준일");
        map.put("email", "skjil1218@kakao.com");

        System.out.println(map);
        System.out.println(map.get("email"));


    }
}
