package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.RouteRepository;
import com.dyvak.main.model.dto.RouteDto;
import com.dyvak.main.model.entity.impl.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class RouteService implements LogisticService<RouteDto> {

    @Autowired
    private RouteRepository dao;

    @Transactional(readOnly = true)
    public List<RouteDto> findAll(PageRequest pageable) {
        List<Route> list = (List<Route>) dao.findAll();
        return null;
    }

    @Transactional(readOnly = true)
    public RouteDto findOne(Long id) {
        String routeId = String.valueOf(id);
        dao.findById(routeId);
        return null;
    }

    @Transactional
    public void create(RouteDto dto) {
        Route route = new Route();
        dao.save(route);
    }

    @Transactional
    public void update(Long id, RouteDto dto) {
        Route route = new Route();
        dao.save(route);
    }

    @Transactional
    public void delete(Long[] ids) {
        String[] array = (String[]) Arrays.stream(ids)
                .map(s -> String.valueOf(s))
                .toArray();
        for (String id : array)
            dao.deleteById(id);
    }

    public long count() {
        return dao.count();
    }
}
