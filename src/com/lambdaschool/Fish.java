package com.lambdaschool;

public class Fish extends AbstractAnimal {
    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
