package ru.sbt.generics;

import java.util.List;
import java.util.Map;

public interface CountMap {
    void add(Object o);

    int getCount(Object o);

    //current count
    int remove(Object o);

    int size();

    void addAll(CountMap source);

    Map toMap();

    void toMap(Map destination);

    public static void main(String[] args) {
        CountMap map = null;

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
/*
        int count = map.getCout(5); // 2
        int count = map.getCout(6); // 1
        int count = map.getCout(10); // 3*/
    }
}
