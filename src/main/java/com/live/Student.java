package com.live;

public class Student extends Human {
    
    private WashingDevice washingDevice;

    public void setWashingDevice(WashingDevice washingDevice) {
        this.washingDevice = washingDevice;
    }

    public void doWashing() {
        doWashing(washingDevice);
    }
}
