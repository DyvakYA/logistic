package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.MedicalCertificate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalCertificateRepository extends CrudRepository<MedicalCertificate, String> {
}
