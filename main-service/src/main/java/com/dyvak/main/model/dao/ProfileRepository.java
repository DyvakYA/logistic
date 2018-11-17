package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, String> {
    Optional<Profile> findById(String profileId);

    void deleteById(String id);
}
