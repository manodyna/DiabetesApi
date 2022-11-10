package com.dyna.miniproject.repository;

import com.dyna.miniproject.model.PatientModel;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientModel, Integer> {

}
