package com;

public class Main {

    private String variable;
    public  static final String namse;
    static {
        namse = "name";
        System.out.println("static init com.Main class");
    }
    {
        System.out.println("anonymous init com.Main class");
    }
    public Main(){
        System.out.println("init class com.Main");
        printVariable();
        
    }

    public Main(String variable) {
        this.variable = variable;
    }

    protected void printVariable(){
        System.out.println("call printMethod from com.Main class");
        variable = "variable is initialized in com.Main Class";
    }
}

