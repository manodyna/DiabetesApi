package com.dyna.miniproject.repository;

import com.dyna.miniproject.model.IncidentsModel;
import com.dyna.miniproject.model.MeasurementsModel;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementsRepository extends CrudRepository<IncidentsModel, Integer> {
}
