package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.SService;
import com.APIProject.apiProject.dto.ServiceDTO;
import com.APIProject.apiProject.service.SupporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class ServiceRestConverter implements RestConverter<SService, ServiceDTO.Response, ServiceDTO.Request> {


    @Autowired
    SupporterService supporterService = new SupporterService();

    @Override
    public ServiceDTO.Response toResponse(SService entity) {
        ServiceDTO.Response dto = new ServiceDTO.Response();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public SService fromRequest(ServiceDTO.Request dto) {
        SService entity = new SService();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        if (entity.getSupporter() != null) {
            entity.setSupporter(new ArrayList<>());
            entity.getSupporter().addAll(dto.getIssues().stream()
                    .map(it -> supporterService.find(it))
                    .collect(Collectors.toList()));
        }
        return entity;
    }
}
