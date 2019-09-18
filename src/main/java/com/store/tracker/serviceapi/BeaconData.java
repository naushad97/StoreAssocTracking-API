package com.store.tracker.serviceapi;

import java.io.Serializable;
import java.util.Date;

public class BeaconData implements Serializable {

    private int major;
    private int minor;
    private int power;
    private int rssi;
    private String proximityUUID;
    private String distanceUnit;
    private double distance;
    private String proximity;
    private String scanDateTimeStamp;
    private long scanTimeInMillis;
    private long handshakeTimeNano;
    private String userId;
    private String type;

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

    public String getProximityUUID() {
        return proximityUUID;
    }

    public void setProximityUUID(String proximityUUID) {
        this.proximityUUID = proximityUUID;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getProximity() {
        return proximity;
    }

    public void setProximity(String proximity) {
        this.proximity = proximity;
    }

    public String getScanDateTimeStamp() {
        return scanDateTimeStamp;
    }

    public void setScanDateTimeStamp(String scanDateTimeStamp) {
        this.scanDateTimeStamp = scanDateTimeStamp;
    }

    public long getScanTimeInMillis() {
        return scanTimeInMillis;
    }

    public void setScanTimeInMillis(long scanTimeInMillis) {
        this.scanTimeInMillis = scanTimeInMillis;
    }

    public long getHandshakeTimeNano() {
        return handshakeTimeNano;
    }

    public void setHandshakeTimeNano(long handshakeTimeNano) {
        this.handshakeTimeNano = handshakeTimeNano;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
