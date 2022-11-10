package com.dyna.miniproject.repository;

import org.springframework.data.repository.CrudRepository;
import com.dyna.miniproject.model.DevicesModel;

public interface DevicesRepository extends CrudRepository<DevicesModel, Integer> {

}
