package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.MedicalCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCertificateService implements LogisticService<MedicalCertificateService>{

    @Autowired
    private MedicalCertificateRepository dao;

    @Override
    public List<MedicalCertificateService> findAll(PageRequest id) {
        return null;
    }

    @Override
    public MedicalCertificateService findOne(Long id) {
        return null;
    }

    @Override
    public void create(MedicalCertificateService dto) {

    }

    @Override
    public void update(Long id, MedicalCertificateService dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
