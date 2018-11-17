package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, String> {
    Optional<Cargo> findById(String cargoId);

    void deleteById(String id);
}
