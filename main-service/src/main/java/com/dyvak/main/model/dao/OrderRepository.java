package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order, String>{
    Optional<Order> findById(String userId);

    void deleteById(String id);
}
