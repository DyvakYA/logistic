package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends CrudRepository<Route, String> {
}
