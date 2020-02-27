package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Supporter;
import com.APIProject.apiProject.dto.SupporterDTO;
import com.APIProject.apiProject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class SupporterRestConverter implements RestConverter<Supporter, SupporterDTO.Response, SupporterDTO.Request> {

    @Autowired
    SupervisorService supervisorService = new SupervisorService();
    @Autowired
    SServiveService sServiveService = new SServiveService();
    @Autowired
    NotesService notesService = new NotesService();
    @Autowired
    SIssueService sIssueService = new SIssueService();



    @Override
    public SupporterDTO.Response toResponse(Supporter request) {
        SupporterDTO.Response entity = new SupporterDTO.Response();
        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setFirstSurname(request.getFirstSurname());
        entity.setSecondSurname(request.getSecondSurname());
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        return entity;
    }

    @Override
    public Supporter fromRequest(SupporterDTO.Request request) {
        Supporter entity = new Supporter();
        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setFirstSurname(request.getFirstSurname());
        entity.setSecondSurname(request.getSecondSurname());
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        if (entity.getNotes() != null) {
            entity.setNotes(new ArrayList<>());
            entity.getNotes().addAll(request.getNotes().stream()
                    .map(it -> notesService.find(it))
                    .collect(Collectors.toList()));
        }
        if (entity.getIssues() != null) {
            entity.setIssues(new ArrayList<>());
            entity.getIssues().addAll(request.getIssues().stream()
                    .map(it -> sIssueService.find(it))
                    .collect(Collectors.toList()));
        }
        entity.setSupporter(supervisorService.find(request.getSupporter()));
        entity.setService(sServiveService.find(request.getService()));
        return entity;
    }
}
