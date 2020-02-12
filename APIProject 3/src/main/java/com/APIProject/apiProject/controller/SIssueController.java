package com.APIProject.apiProject.controller;

import com.APIProject.apiProject.converter.SIssueRestConverter;
import com.APIProject.apiProject.domain.business.SIssue;
import com.APIProject.apiProject.dto.SIssueDTO;
import com.APIProject.apiProject.dto.SupporterDTO;
import com.APIProject.apiProject.service.SIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping(path = "/sIssues")
@CrossOrigin
public class SIssueController {

    @Autowired
    private SIssueService service;

    @Autowired
    private SIssueRestConverter converter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public SIssueDTO.Response findById(
            @PathVariable("id") String id) {
        return converter.toResponse(service.find(parseInt(id)));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public SIssueDTO.Response save(@Valid @RequestBody SIssueDTO.Request sIssue) {
        return converter.toResponse(service.save(converter.fromRequest(sIssue)));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public SIssueDTO.Response update(@Valid @PathVariable(value = "id", required = false) String id,
                                     @RequestBody SIssueDTO.Request sIssue) {
        SIssue toUpdate = converter.fromRequest(sIssue);
        toUpdate.setId(parseInt(id));
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        service.delete(parseInt(id));
    }


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<SIssueDTO> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }

}
