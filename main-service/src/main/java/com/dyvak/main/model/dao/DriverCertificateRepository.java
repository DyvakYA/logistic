package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.DriverCertificate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverCertificateRepository extends CrudRepository<DriverCertificate, String> {
}
