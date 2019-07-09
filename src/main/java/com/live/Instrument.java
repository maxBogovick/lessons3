package com.live;

public class Instrument {
    public void play() {
        System.out.println("tra ta ta");
    }
    public static void tune(Instrument instrument) {
        System.out.println(instrument.toString());
        instrument.play();
    }
}
