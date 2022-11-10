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
}
