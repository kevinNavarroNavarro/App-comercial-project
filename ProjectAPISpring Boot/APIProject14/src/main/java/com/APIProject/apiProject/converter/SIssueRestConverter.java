package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.SIssue;
import com.APIProject.apiProject.dto.SIssueDTO;
import com.APIProject.apiProject.service.NotesService;
import com.APIProject.apiProject.service.SupervisorService;
import com.APIProject.apiProject.service.SupporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class SIssueRestConverter implements RestConverter<SIssue, SIssueDTO.Response, SIssueDTO.Request> {

    @Autowired
    SupervisorService supervisorService = new SupervisorService();
    @Autowired
    SupporterService supporterService = new SupporterService();
    @Autowired
    NotesService notesService = new NotesService();



    @Override
    public SIssueDTO.Response toResponse(SIssue entity) {
        SIssueDTO.Response dto = new SIssueDTO.Response();
        dto.setId(entity.getId());
        dto.setClassification(entity.getClassification());
        dto.setReportNumber(entity.getReportNumber());
        dto.setReportTimeStamp(entity.getReportTimeStamp());
        dto.setResolutionComment(entity.getResolutionComment());
        dto.setStatus(entity.getStatus());
        return dto;
    }

    @Override
    public SIssue fromRequest(SIssueDTO.Request dto) {
        SIssue entity = new SIssue();
        dto.setId(dto.getId());
        entity.setClassification(dto.getClassification());
        entity.setReportNumber(dto.getReportNumber());
        entity.setReportTimeStamp(dto.getReportTimeStamp());
        entity.setResolutionComment(dto.getResolutionComment());
        entity.setStatus(dto.getStatus());
        if (entity.getNotes() != null) {
            entity.setNotes(new ArrayList<>());
            entity.getNotes().addAll(dto.getNotes().stream()
                    .map(it -> notesService.find(it))
                    .collect(Collectors.toList()));
        }
        entity.setSupervisor(supervisorService.find(dto.getIdSupervisor()));
        entity.setSupporter(supporterService.find(dto.getIdSupporter()));
        return entity;
    }
}
