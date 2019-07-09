package com.live;

public interface IAnimal {
     String s = "";
    
    void sound();
    
    default IAnimal getCreature() {
        return this;
    }
}
