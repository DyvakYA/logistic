package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.PlaceRepository;
import com.dyvak.main.model.dto.PlaceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService implements LogisticService<PlaceDto> {

    @Autowired
    private PlaceRepository dao;

    @Override
    public List<PlaceDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public PlaceDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(PlaceDto dto) {

    }

    @Override
    public void update(int id, PlaceDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
