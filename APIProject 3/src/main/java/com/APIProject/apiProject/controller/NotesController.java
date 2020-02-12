package com.APIProject.apiProject.controller;


import com.APIProject.apiProject.converter.NotesRestConverter;
import com.APIProject.apiProject.domain.business.Notes;
import com.APIProject.apiProject.dto.NotesDTO;
import com.APIProject.apiProject.dto.SupporterDTO;
import com.APIProject.apiProject.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/notes")
@CrossOrigin
public class NotesController {

    @Autowired
    private NotesService service;

    @Autowired
    private NotesRestConverter converter;


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public NotesDTO findById(
            @PathVariable("id") String id) {
        return converter.toResponse(service.find(Integer.parseInt(id)));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public NotesDTO save(@Valid @RequestBody NotesDTO.Request notes) {
        return converter.toResponse(service.save(converter.fromRequest(notes)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public NotesDTO update(@Valid @PathVariable("id") String id,
                           @RequestBody NotesDTO.Request  notes) {
        Notes toUpdate = converter.fromRequest(notes);
        toUpdate.setId(Integer.parseInt(id));
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        service.delete(Integer.parseInt(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<NotesDTO> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
