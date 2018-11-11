package com.dyvak.main.model.service;

import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface LogisticService<T> {

    List<T> findAll(PageRequest id);

    T findOne(Long id);

    void create(T dto);

    void update(int id, T dto);

    void delete(Long[] ids);

    long count();
}
