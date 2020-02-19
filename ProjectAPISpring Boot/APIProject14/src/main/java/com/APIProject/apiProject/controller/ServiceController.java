package com.APIProject.apiProject.controller;

import com.APIProject.apiProject.converter.ServiceRestConverter;
import com.APIProject.apiProject.domain.business.SService;
import com.APIProject.apiProject.dto.ServiceDTO;
import com.APIProject.apiProject.service.SServiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/services")
@CrossOrigin
public class ServiceController {

    @Autowired
    private SServiveService service;

    @Autowired
    private ServiceRestConverter converter;


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ServiceDTO.Response findById(
            @PathVariable ("id") String id) {
        return converter.toResponse(service.find(Integer.parseInt(id)));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ServiceDTO.Response save(@RequestBody ServiceDTO.Request sServiveDTO) {
        return converter.toResponse(service.save(converter.fromRequest(sServiveDTO)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ServiceDTO.Response update(@PathVariable("id") String id,
                                      @RequestBody ServiceDTO.Request  sServiveDTO) {
        SService toUpdate = converter.fromRequest(sServiveDTO);
        toUpdate.setId(Integer.parseInt(id));
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        service.delete(Integer.parseInt(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<ServiceDTO.Response> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }

}
