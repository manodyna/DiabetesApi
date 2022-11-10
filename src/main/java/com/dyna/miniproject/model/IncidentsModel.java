package com.dyna.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IncidentsModel {
    @Id
    @GeneratedValue
    int incidentId;
    String incidentType;
    int patientId;
    int measurementId;

    public IncidentsModel(int incidentId, String incidentType, int patientId, int measurementId) {
        this.incidentId = incidentId;
        this.incidentType = incidentType;
        this.patientId = patientId;
        this.measurementId = measurementId;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }


}
