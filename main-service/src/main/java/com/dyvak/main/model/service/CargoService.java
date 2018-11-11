package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.CargoRepository;
import com.dyvak.main.model.dto.CargoDto;
import com.dyvak.main.model.entity.impl.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CargoService implements LogisticService<CargoDto> {

    @Autowired
    private CargoRepository dao;

    @Override
    public List<CargoDto> findAll(PageRequest id) {
        List<Cargo> cargo = (List<Cargo>) dao.findAll();
        return null;
    }

    @Override
    public CargoDto findOne(Long id) {
        String cargoId = String.valueOf(id);
        Optional<Cargo> cargo = dao.findById(cargoId);
        return null;
    }

    @Override
    public void create(CargoDto dto) {
        Cargo cargo = new Cargo();
        dao.save(cargo);
    }

    @Override
    public void update(int id, CargoDto dto) {
        Cargo cargo = new Cargo();
        cargo.setId(id);
        dao.save(cargo);
    }

    @Override
    public void delete(Long[] ids) {
        String[] array = (String[]) Arrays.stream(ids)
                .map(s -> String.valueOf(s))
                .toArray();
        for (String id : array)
            dao.deleteById(id);
    }

    @Override
    public long count() {
        return dao.count();
    }
}
