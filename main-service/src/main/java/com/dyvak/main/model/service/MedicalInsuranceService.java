package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.MedicalInsuranceRepository;
import com.dyvak.main.model.entity.impl.MedicalInsurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalInsuranceService implements LogisticService<MedicalInsurance> {

    @Autowired
    private MedicalInsuranceRepository dao;

    @Override
    public List<MedicalInsurance> findAll(PageRequest id) {
        return null;
    }

    @Override
    public MedicalInsurance findOne(Long id) {
        return null;
    }

    @Override
    public void create(MedicalInsurance dto) {

    }

    @Override
    public void update(Long id, MedicalInsurance dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
