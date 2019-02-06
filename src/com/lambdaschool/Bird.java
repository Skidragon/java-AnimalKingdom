package com.lambdaschool;

public class Bird extends AbstractAnimal {
    public Bird(String name, int yearNamed) {
        super(name, yearNamed);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
