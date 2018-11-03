package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.CargoRepository;
import com.dyvak.main.model.dto.CargoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService implements LogisticService<CargoDto> {

    @Autowired
    private CargoRepository dao;

    @Override
    public List<CargoDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public CargoDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(CargoDto dto) {

    }

    @Override
    public void update(Long id, CargoDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
