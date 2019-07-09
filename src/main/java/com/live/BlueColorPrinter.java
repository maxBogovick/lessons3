package com.live;

public class BlueColorPrinter extends Printer {

    public static final String ANSI_BLUE   = "\u001B[34m";
    
    @Override
    public String getTextColor() {
        return ANSI_BLUE;
    }
}
