package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.PassportRepository;
import com.dyvak.main.model.dto.PassportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService implements LogisticService<PassportDto> {

    @Autowired
    private PassportRepository dao;

    @Override
    public List<PassportDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public PassportDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(PassportDto dto) {

    }

    @Override
    public void update(Long id, PassportDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
