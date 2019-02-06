package com.lambdaschool;

public class Mammal extends AbstractAnimal {

    public Mammal(String name, int yearNamed) {
        super(name, yearNamed);
    }

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

}
