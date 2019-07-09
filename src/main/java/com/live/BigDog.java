package com.live;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("BigDog");
    }

    public Dog getCreature(String name) {
        return new Dog(name);
    }
}
