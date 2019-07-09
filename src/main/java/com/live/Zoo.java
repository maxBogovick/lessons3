package com.live;

import java.util.Arrays;
import java.util.Comparator;

public class Zoo {
    public static final String ANSI_RESET  = "\u001B[0m";

    public static final String ANSI_BLACK  = "\u001B[30m";
    public static final String ANSI_RED    = "\u001B[31m";
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE   = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN   = "\u001B[36m";
    public static final String ANSI_WHITE  = "\u001B[37m";

    public static final String ANSI_BRIGHT_BLACK  = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED    = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN  = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
    public static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";
    public static final String ANSI_BRIGHT_CYAN   = "\u001B[96m";
    public static final String ANSI_BRIGHT_WHITE  = "\u001B[97m";

    public static final String[] FOREGROUNDS = {
            ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW,
            ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE,
            ANSI_BRIGHT_BLACK, ANSI_BRIGHT_RED, ANSI_BRIGHT_GREEN, ANSI_BRIGHT_YELLOW,
            ANSI_BRIGHT_BLUE, ANSI_BRIGHT_PURPLE, ANSI_BRIGHT_CYAN, ANSI_BRIGHT_WHITE
    };

    public static final String ANSI_BG_BLACK  = "\u001B[40m";
    public static final String ANSI_BG_RED    = "\u001B[41m]";
    public static final String ANSI_BG_GREEN  = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE   = "\u001B[44m";
    public static final String ANSI_BG_PURPLE = "\u001B[45m";
    public static final String ANSI_BG_CYAN   = "\u001B[46m";
    public static final String ANSI_BG_WHITE  = "\u001B[47m";

    public static final String ANSI_BRIGHT_BG_BLACK  = "\u001B[100m";
    public static final String ANSI_BRIGHT_BG_RED    = "\u001B[101m";
    public static final String ANSI_BRIGHT_BG_GREEN  = "\u001B[102m";
    public static final String ANSI_BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String ANSI_BRIGHT_BG_BLUE   = "\u001B[104m";
    public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
    public static final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";

    public static final String[] BACKGROUNDS = {
            ANSI_BG_BLACK, ANSI_BG_RED, ANSI_BG_GREEN, ANSI_BG_YELLOW,
            ANSI_BG_BLUE, ANSI_BG_PURPLE, ANSI_BG_CYAN, ANSI_BG_WHITE,
            ANSI_BRIGHT_BG_BLACK, ANSI_BRIGHT_BG_RED, ANSI_BRIGHT_BG_GREEN, ANSI_BRIGHT_BG_YELLOW,
            ANSI_BRIGHT_BG_BLUE, ANSI_BRIGHT_BG_PURPLE, ANSI_BRIGHT_BG_CYAN, ANSI_BRIGHT_BG_WHITE };

    /*public static void main(String[] args) {

        *//*for (String fg : FOREGROUNDS) {
            for (String bg : BACKGROUNDS)
                System.out.print(fg + bg + "  TEST  ");
            System.out.println(ANSI_RESET);
        }

        System.out.println(ANSI_RESET + "\n  Back to default.\n");*//*
        *//*System.out.print(ANSI_BRIGHT_CYAN);
        System.out.println("Tester");
        System.out.println(ANSI_BRIGHT_BG_CYAN);
        System.out.println("Tester");*//*
        Printer printer = new BlueColorPrinter();
        printer.print("Hello World");
        printer = new RedColorPrinter();
        printer.print("Hello World");
        printer = new PurpleColorPrinter();
        printer.print("Hello World");
        printer.reset();
        printer.print("Hello World");
    }*/
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Elephant("2");
        animals[1] = new Dog("1");
        animals[2] = new Duck("3");
        animals[3] = new BigDog("4");
        animals[4] = new Animal("5") {
            @Override
            public void sound() {
                System.out.println("DOUH!!!");
            }
        };
        animals[5] = new Animal("6") {
            @Override
            public void sound() {
                System.out.println("DOUH2!!!");
            }
        };
        
         Arrays.sort(animals, new Comparator<Animal>() {
             @Override
             public int compare(Animal o1, Animal o2) {
                 if (o1.getName().equals(o2.getName())) return 0;
                 return o1.getName().charAt(0) < o2.getName().charAt(0) ? 1 : -1;
             }
         });
        
        System.out.println(Arrays.toString(animals));
        int index = 0;
        for (Animal animal:animals) {
            if (!(animal instanceof Pet && animal instanceof Mammal)) {
                animals[index] = null;
            }
            index++;
        }
        System.out.println(Arrays.toString(animals));
    }
}
