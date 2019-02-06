package com.lambdaschool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal anim : animals) {
            if(tester.test(anim)) {
                System.out.println(anim.getName());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animalList = new ArrayList<>();
        // Mammal instances
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);
        animalList.addAll(Arrays.asList(panda,zebra,koala,sloth,armadillo, raccoon, bigfoot));
        // Bird instances
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        animalList.addAll(Arrays.asList(pigeon,peacock,toucan,parrot,swan));

        // Fish instances
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        animalList.addAll(Arrays.asList(salmon, catfish, perch));


          //Year Named Sort
          animalList.sort((anim1, anim2) -> anim1.getYearNamed() - anim2.getYearNamed());
          System.out.println("*** List all the animals in descending order by year named ***");
          animalList.forEach(anim -> System.out.println(anim.toString() + '\n'));

          //Animal Name sort
          animalList.sort((anim1, anim2) -> anim1.getName().compareToIgnoreCase(anim2.getName()));
          System.out.println("*** List all the animals alphabetically ***");
          animalList.forEach(anim -> System.out.println(anim.toString() + '\n'));

        System.out.println("*** List all the animals order by how they move  ***");
        animalList.sort((anim1, anim2) -> anim1.move().compareToIgnoreCase(anim2.move()));
        animalList.forEach(anim -> System.out.println(anim.toString() + "     moves: " + anim.move() + '\n'));

        System.out.println("*** List only those animals the breath with lungs ***");
        printAnimals(animalList, anim -> anim.breath() == "lungs");


        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        printAnimals(animalList, anim -> anim.breath() == "lungs" && anim.getYearNamed() == 1758);


        System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
        printAnimals(animalList, anim -> anim.breath() == "lungs" && anim.getYearNamed() == 1758);


        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        animalList.sort((anim1,anim2) -> anim1.getName().compareToIgnoreCase(anim2.getName()));
        printAnimals(animalList, anim -> anim.getYearNamed() == 1758);
    }
}
