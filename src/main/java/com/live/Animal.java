package com.live;

public abstract class Animal {
    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void sound();
    public String getName() {
        return name;
    }; 
    
    public Animal getCreature() {
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
