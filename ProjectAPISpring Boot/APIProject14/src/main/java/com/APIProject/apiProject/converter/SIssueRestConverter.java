package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.SIssue;
import com.APIProject.apiProject.dto.SIssueDTO;
import com.APIProject.apiProject.service.SupervisorService;
import com.APIProject.apiProject.service.SupporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SIssueRestConverter implements RestConverter<SIssue, SIssueDTO.Response, SIssueDTO.Request> {

    @Autowired
    SupervisorRestConverter supervisorConverter = new SupervisorRestConverter();
    @Autowired
    SupervisorService supervisorService = new SupervisorService();
    @Autowired
    SupporterRestConverter supporterConverter = new SupporterRestConverter();
    @Autowired
    SupporterService supporterService = new SupporterService();



    @Override
    public SIssueDTO.Response toResponse(SIssue entity) {
        SIssueDTO.Response dto = new SIssueDTO.Response();
        dto.setId(entity.getId());
        dto.setClassification(entity.getClassification());
        dto.setReportNumber(entity.getReportNumber());
        dto.setReportTimeStamp(entity.getReportTimeStamp());
        dto.setResolutionComment(entity.getResolutionComment());
        dto.setStatus(entity.getStatus());
        dto.setIdSupervisor(supervisorConverter.toResponse(entity.getSupervisor()));
        dto.setIdSupporter(supporterConverter.toResponse(entity.getSupporter()));
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
        entity.setSupervisor(supervisorService.find(dto.getIdSupervisor()));
        entity.setSupporter(supporterService.find(dto.getIdSupporter()));
        return entity;
    }
}
