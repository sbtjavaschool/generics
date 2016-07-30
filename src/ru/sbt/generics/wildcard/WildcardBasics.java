package ru.sbt.generics.wildcard;

import ru.sbt.generics.wildcard.model.Animal;
import ru.sbt.generics.wildcard.model.Cat;
import ru.sbt.generics.wildcard.model.Dog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WildcardBasics {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<Number>();
        List<Animal> animals = new ArrayList<Animal>();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("d1"));

        printAnimalNames(dogs);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("c2"));
        printAnimalNames(cats);
    }

    static void printAnimalNames(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
