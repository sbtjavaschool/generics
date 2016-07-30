package ru.sbt.generics;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsCollections {
    public static void main(String[] args) {
          run(new Integer[10]); // ковариантность
          run(new Double[10]);

        List<Number> numbers = new ArrayList<Number>();
      //List<Number> numbers = new ArrayList<Integer>(); compile error

    }

    private static void run(Number[] numbers) {
        numbers[0] = 1;
        numbers[1] = 1d;
        numbers[2] = 10L;
    }
}
