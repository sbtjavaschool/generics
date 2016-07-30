package ru.sbt.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diamond {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();

        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        Map<String, List<Integer>> map2 = new HashMap<>(); //diamond
        Map<String, List<Integer>> map3 = new HashMap(); //bad!

    }
}