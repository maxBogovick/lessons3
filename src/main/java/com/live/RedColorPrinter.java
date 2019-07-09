package com.live;

public class RedColorPrinter extends Printer {

    public static final String ANSI_RED    = "\u001B[31m";
    
    @Override
    public String getTextColor() {
        return ANSI_RED;
    }
}
