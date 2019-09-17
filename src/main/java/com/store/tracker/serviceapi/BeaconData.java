package com.store.tracker.serviceapi;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class BeaconData implements Serializable {

    private String proximityUUID;
    private String userId;
    private int major;
    private int minor;
    private int power;
    private int rssi;
    private double distance;
    private String scanTimeStamp;

    public String getProximityUUID() {
        return proximityUUID;
    }

    public void setProximityUUID(String proximityUUID) {
        this.proximityUUID = proximityUUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getScanTimeStamp() {
        return scanTimeStamp;
    }

    public void setScanTimeStamp(String scanTimeStamp) {
        this.scanTimeStamp = scanTimeStamp;
    }
}
