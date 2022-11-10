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

    public PractitionerModel(int practitionerId, String firstName, String lastName, String email, String phone, String region, String certification) {
        this.practitionerId = practitionerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.region = region;
        this.certification = certification;
    }

    public PractitionerModel() {

    }

    public int getPractitionerId() {
        return practitionerId;
    }

    public void setPractitionerId(int practitionerId) {
        this.practitionerId = practitionerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
