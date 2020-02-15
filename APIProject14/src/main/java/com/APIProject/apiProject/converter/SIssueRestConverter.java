package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.SIssue;
import com.APIProject.apiProject.dto.SIssueDTO;
import org.springframework.stereotype.Service;

@Service
public class SIssueRestConverter implements RestConverter<SIssue, SIssueDTO.Response, SIssueDTO.Request> {

    @Override
    public SIssueDTO.Response toResponse(SIssue entity) {
        SIssueDTO.Response dto = new SIssueDTO.Response();
        dto.setId(entity.getId());
        dto.setClassification(entity.getClassification());
        dto.setIdSupervisor(entity.getIdSuppervisor());
        dto.setIdSupporter(entity.getIdSupporter());
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
        entity.setIdSuppervisor(dto.getIdSupervisor());
        entity.setIdSupporter(dto.getIdSupporter());
        entity.setReportNumber(dto.getReportNumber());
        entity.setReportTimeStamp(dto.getReportTimeStamp());
        entity.setResolutionComment(dto.getResolutionComment());
        entity.setStatus(dto.getStatus());
        return entity;
    }
}
