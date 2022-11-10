package com.dyna.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PractitionerModel {
    @Id
    @GeneratedValue
    int practitionerId;
    String firstName;
    String lastName;
    String email;
    String phone;
    String region;
    String certification;
}
