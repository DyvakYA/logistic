package com.dyvak.main.controller;

import com.dyvak.main.model.dto.CargoDto;
import com.dyvak.main.model.dto.MedicalInsuranceDto;
import com.dyvak.main.model.entity.impl.MedicalInsurance;
import com.dyvak.main.model.service.CargoService;
import com.dyvak.main.model.service.MedicalInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/insurance/medical")
public class MedicalInsuranceController {

    @Autowired
    private MedicalInsuranceService service;

    final int ITEMS_PER_PAGE = 6;

    @RequestMapping(method = RequestMethod.GET)
    public List<MedicalInsuranceDto> profiles(@RequestParam(required = false, defaultValue = "0") Integer page) {
        if (page < 0) page = 0;
        return service.findAll(new PageRequest(page, ITEMS_PER_PAGE, Sort.Direction.DESC, "id"));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MedicalInsuranceDto profile(@PathVariable(value = "id") Long id) {
        return service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> create(@Valid @RequestBody MedicalInsuranceDto dto) {
        service.create(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@Valid @PathVariable(value = "id") int id, @RequestBody MedicalInsuranceDto dto) {
        service.update(id, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id[]}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable(value = "id[]") Long[] ids) {
        if (ids != null && ids.length > 0)
            service.delete(ids);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    protected long getPageCount() {
        long totalCount = service.count();
        return (totalCount / ITEMS_PER_PAGE) + ((totalCount % ITEMS_PER_PAGE > 0) ? 1 : 0);
    }
}
