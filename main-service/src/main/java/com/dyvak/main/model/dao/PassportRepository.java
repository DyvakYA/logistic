package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Passport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends CrudRepository<Passport, String> {
}
