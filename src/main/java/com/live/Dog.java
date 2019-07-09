package com.live;

public class Dog extends Animal implements Pet, Mammal {
    private int age;
    private String sex;
    private double height;
    private double weight;
    private double length;
    private double width;

    public Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        
    }

    public void sound() {
        System.out.println("gav gav");    
    }

    @Override
    public void executeCommand() {
        System.out.println("I don't do it");
    }

    @Override
    public void doMilk() {
        System.out.println("I don't do it");
    }
}
