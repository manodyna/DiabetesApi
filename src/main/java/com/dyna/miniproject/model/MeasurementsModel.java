package com.dyna.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MeasurementsModel {
    @Id
    @GeneratedValue
    int measurementId;
    String deviceType;
    String timestamp;
    int reading;

    public MeasurementsModel(int measurementId, String deviceType, String timestamp, int reading) {
        this.measurementId = measurementId;
        this.deviceType = deviceType;
        this.timestamp = timestamp;
        this.reading = reading;
    }

    public int getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }
}
