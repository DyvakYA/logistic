package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.MedicalInsurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInsuranceRepository extends CrudRepository<MedicalInsurance, String> {
}
