package com.live;

public class Guitar extends Instrument {
    /*public int getCountString() {
        return 5;
    }*/
    
    public static void main(String[] args) {
        Guitar guitar = (Guitar) new Instrument();
        System.out.println(guitar.toString());
        //System.out.println(guitar.getCountString());
        Instrument.tune(guitar);
        Instrument guitar2 = new Guitar();
        Instrument.tune(guitar2);
    }
}
