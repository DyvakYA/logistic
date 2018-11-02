package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends CrudRepository<Transport, String> {
}
