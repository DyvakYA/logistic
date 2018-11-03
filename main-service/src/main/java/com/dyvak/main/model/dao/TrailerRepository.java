package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Trailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailerRepository extends CrudRepository<Trailer, String> {
}
