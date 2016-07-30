package ru.sbt.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        CollectionSimpleExample example = new CollectionSimpleExample();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        example.process(list);
    }
}
