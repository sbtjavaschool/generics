package ru.sbt.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<Number>();
        List<Integer> integers = new ArrayList<Integer>();

        List temp = integers;
        numbers = temp;

        numbers.add(2D);
        Integer integer = integers.get(0);
    }
}
