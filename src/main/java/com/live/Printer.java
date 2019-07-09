package com.live;

public class Printer {
    public static final String ANSI_RESET  = "\u001B[0m";
    
    protected String getTextColor () {
        return ANSI_RESET; 
    }
    
    public void print(String text) {
        System.out.println(getTextColor() + text);
    }
    
    public void reset() {
        System.out.println(ANSI_RESET);
    }
}
