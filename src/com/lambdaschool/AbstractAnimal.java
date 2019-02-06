package com.lambdaschool;

public abstract class AbstractAnimal {
    private static int maxId = 0;
    private int id;
    private String name;
    private int yearNamed;
    public AbstractAnimal(String name, int yearNamed) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }
    public AbstractAnimal(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                '}';
    }
}

