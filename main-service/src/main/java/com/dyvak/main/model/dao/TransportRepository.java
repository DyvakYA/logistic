package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends CrudRepository<Transport, String> {
}
