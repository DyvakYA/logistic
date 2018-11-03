package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, String> {
}
