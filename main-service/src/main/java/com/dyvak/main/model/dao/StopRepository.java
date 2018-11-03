package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Stop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends CrudRepository<Stop, String> {
}
