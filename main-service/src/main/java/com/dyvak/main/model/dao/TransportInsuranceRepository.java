package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.TransportInsurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportInsuranceRepository extends CrudRepository<TransportInsurance, String> {
}
