package com.study.ch17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");

        System.out.println(nameList);


        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);

        System.out.println(newNameList.get(1));

        String findName = null;

        for(String name : names) {
            if(name.equals("김준삼")) {
                findName = name;
                break;
            }
        }

        System.out.println(findName);

    }
}
