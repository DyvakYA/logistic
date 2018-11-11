package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.TransportInsuranceRepository;
import com.dyvak.main.model.dto.TransportInsuranceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportInsuranceService implements LogisticService<TransportInsuranceDto> {

    @Autowired
    private TransportInsuranceRepository dao;

    @Override
    public List<TransportInsuranceDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public TransportInsuranceDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(TransportInsuranceDto dto) {

    }

    @Override
    public void update(int id, TransportInsuranceDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
