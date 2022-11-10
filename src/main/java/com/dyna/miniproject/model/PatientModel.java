package com.dyna.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PatientModel {
    @Id
    @GeneratedValue
    int patientId;
    String firstName;
    String lastName;
    String email;
    String phone;
    String region;
    String address;
    String condition;
    int practitionerId;
}
