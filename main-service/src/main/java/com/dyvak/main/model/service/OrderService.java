package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.OrderRepository;
import com.dyvak.main.model.dto.OrderDto;
import com.dyvak.main.model.entity.impl.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository dao;

    @Transactional(readOnly = true)
    public List<OrderDto> findAll(PageRequest id) {
        List<Order> orders = (List<Order>) dao.findAll();
        return null;
    }

    @Transactional(readOnly = true)
    public OrderDto findOne(Long id) {
        String userId = String.valueOf(id);
        Optional<Order> order = dao.findById(userId);
        return null;
    }

    @Transactional
    public void create(OrderDto dto) {
        Order order = new Order();
        dao.save(order);
    }

    @Transactional
    public void update(Long id, OrderDto dto) {
        Order order = new Order();
        dao.save(order);
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
