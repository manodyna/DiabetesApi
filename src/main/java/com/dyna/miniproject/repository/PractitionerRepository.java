package com.dyna.miniproject.repository;

import com.dyna.miniproject.model.PractitionerModel;
import org.springframework.data.repository.CrudRepository;

public interface PractitionerRepository extends CrudRepository<PractitionerModel, Integer> {
}
