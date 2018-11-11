package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.MedicalInsuranceRepository;
import com.dyvak.main.model.dto.MedicalInsuranceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalInsuranceService implements LogisticService<MedicalInsuranceDto> {

    @Autowired
    private MedicalInsuranceRepository dao;

    @Override
    public List<MedicalInsuranceDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public MedicalInsuranceDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(MedicalInsuranceDto dto) {

    }

    @Override
    public void update(int id, MedicalInsuranceDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
