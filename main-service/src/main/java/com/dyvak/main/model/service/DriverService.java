package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.DriverRepository;
import com.dyvak.main.model.dto.DriverDto;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements LogisticService<DriverDto>{

    @Autowired
    private DriverRepository dao;

    @Override
    public List<DriverDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public DriverDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(DriverDto dto) {

    }

    @Override
    public void update(int id, DriverDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
