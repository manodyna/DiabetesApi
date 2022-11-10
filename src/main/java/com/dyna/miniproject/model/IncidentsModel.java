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
}
