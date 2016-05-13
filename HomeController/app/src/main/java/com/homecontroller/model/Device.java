package com.homecontroller.model;

/**
 * Created by gmra on 2016-05-10.
 */
public class Device {

    private String deviceName;
    private String status;

    public Device(String deviceName, String status) {
        this.deviceName = deviceName;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


}
