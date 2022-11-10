package com.dyna.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DevicesModel {
    @Id
    @GeneratedValue
    private int deviceId;
    private String deviceType;

}
