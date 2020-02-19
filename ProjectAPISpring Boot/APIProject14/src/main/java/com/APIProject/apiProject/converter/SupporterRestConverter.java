package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Supporter;
import com.APIProject.apiProject.dto.SupporterDTO;
import com.APIProject.apiProject.service.SIssueService;
import com.APIProject.apiProject.service.SServiveService;
import com.APIProject.apiProject.service.SupervisorService;
import com.APIProject.apiProject.service.SupporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupporterRestConverter implements RestConverter<Supporter, SupporterDTO.Response, SupporterDTO.Request> {

    @Autowired
    SupervisorRestConverter supervisorConverter = new SupervisorRestConverter();
    @Autowired
    SupervisorService supervisorService = new SupervisorService();
    @Autowired
    ServiceRestConverter serviceConverter = new ServiceRestConverter();
    @Autowired
    SServiveService sServiveService = new SServiveService();



    @Override
    public SupporterDTO.Response toResponse(Supporter request) {
        SupporterDTO.Response entity = new SupporterDTO.Response();
        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setFirstSurname(request.getFirstSurname());
        entity.setSecondSurname(request.getSecondSurname());
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        entity.setSupervisor(supervisorConverter.toResponse(request.getSupporter()));
        entity.setService(serviceConverter.toResponse(request.getService()));
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
        entity.setSupporter(supervisorService.find(request.getSupporter()));
        entity.setService(sServiveService.find(request.getService()));
        return entity;
    }
}
