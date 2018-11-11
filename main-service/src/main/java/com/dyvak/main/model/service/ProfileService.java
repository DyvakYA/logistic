package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.ProfileRepository;
import com.dyvak.main.model.dto.ProfileDto;
import com.dyvak.main.model.entity.impl.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements LogisticService<ProfileDto> {

    @Autowired
    private ProfileRepository dao;

    @Transactional(readOnly = true)
    public List<ProfileDto> findAll(PageRequest pageable) {
        List<Profile> list = (List<Profile>) dao.findAll();
        return null;
    }

    @Transactional(readOnly = true)
    public ProfileDto findOne(Long id) {
        String profileId = String.valueOf(id);
        Optional<Profile> profile = dao.findById(profileId);
        return null;
    }

    @Transactional
    public void create(ProfileDto dto) {
        Profile profile = new Profile();
        dao.save(profile);
    }

    @Transactional
    public void update(int id, ProfileDto dto) {
        Profile profile = new Profile();
        dao.save(profile);
    }

    @Transactional
    public void delete(Long[] ids) {
        String[] array = (String[]) Arrays.stream(ids)
                .map(s -> String.valueOf(s))
                .toArray();
        for (String id : array)
            dao.deleteById(id);

    }

    @Transactional
    public long count() {
        return dao.count();
    }
}
