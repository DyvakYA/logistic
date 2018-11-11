package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.MedicalCertificateRepository;
import com.dyvak.main.model.dto.MedicalCertificateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCertificateService implements LogisticService<MedicalCertificateDto>{

    @Autowired
    private MedicalCertificateRepository dao;

    @Override
    public List<MedicalCertificateDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public MedicalCertificateDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(MedicalCertificateDto dto) {

    }

    @Override
    public void update(int id, MedicalCertificateDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}
