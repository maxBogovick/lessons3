package com.live;

public class PurpleColorPrinter extends Printer {

    public static final String ANSI_PURPLE = "\u001B[35m";
    
    @Override
    public String getTextColor() {
        return ANSI_PURPLE;
    }
}
