package com.live;

public class Duck extends Animal implements Swimming {

    public Duck(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("krja krja");
    }

    @Override
    public void doSwimming() {
        System.out.println("I can swimming");
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;//getName().equals(((Duck)obj).getName());
    }
}
