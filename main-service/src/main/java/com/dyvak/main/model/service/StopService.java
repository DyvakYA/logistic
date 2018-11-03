package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.StopRepository;
import com.dyvak.main.model.dto.StopDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopService implements LogisticService<StopDto>{

    @Autowired
    private StopRepository dao;

    @Override
    public List<StopDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public StopDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(StopDto dto) {

    }

    @Override
    public void update(Long id, StopDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
