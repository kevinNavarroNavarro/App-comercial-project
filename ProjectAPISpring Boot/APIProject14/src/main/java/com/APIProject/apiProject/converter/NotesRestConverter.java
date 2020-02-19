package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Notes;
import com.APIProject.apiProject.dto.NotesDTO;
import com.APIProject.apiProject.service.SIssueService;
import com.APIProject.apiProject.service.SupervisorService;
import com.APIProject.apiProject.service.SupporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class NotesRestConverter implements RestConverter<Notes, NotesDTO.Response, NotesDTO.Request> {

    @Autowired
    SIssueRestConverter sIssueConverter = new SIssueRestConverter();
    @Autowired
    SupervisorRestConverter supervisorConverter = new SupervisorRestConverter();
    @Autowired
    SupporterRestConverter supporterConverter = new SupporterRestConverter();
    @Autowired
    SIssueService sIssueService = new SIssueService();
    @Autowired
    SupervisorService supervisorService = new SupervisorService();
    @Autowired
    SupporterService supporterService = new SupporterService();

    @Override
    public NotesDTO.Response toResponse(Notes entity) {
        NotesDTO.Response dto = new NotesDTO.Response();
        dto.setId(entity.getId());
        dto.setDescription(entity.getDescription());
        dto.setName(entity.getName());
        dto.setNoteTimestamp(entity.getNoteTimestamp());
        dto.setsIssue(sIssueConverter.toResponse(entity.getIdIssue()));
        dto.setSupervisor(supervisorConverter.toResponse(entity.getIdSupervisor()));
        dto.setSupporter(supporterConverter.toResponse(entity.getIdSupport()));
        return dto;
    }

    @Override
    public Notes fromRequest(NotesDTO.Request dto) {
        Notes entity = new Notes();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setIdIssue(sIssueService.find(dto.getIdIssue()));
        entity.setIdSupervisor(supervisorService.find(dto.getIdSupervisor()));
        entity.setIdSupport(supporterService.find(dto.getIdSupport()));
        entity.setNoteTimestamp(dto.getNoteTimestamp());
        return entity;
    }
}
