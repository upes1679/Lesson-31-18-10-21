package com.java_collections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add(2);
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2,4);
        numbers.remove(1);
//        System.out.println(numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            Integer integer= numbers.get(i);
            System.out.println(integer);
        }
//        for(Integer number:numbers){
//            System.out.println(number);
//        }
    }
}
