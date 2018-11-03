package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, String> {
}
