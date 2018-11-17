package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findById(String userId);

    void deleteById(String id);
}
