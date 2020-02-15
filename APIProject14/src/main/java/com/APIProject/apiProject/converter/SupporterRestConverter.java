package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Supporter;
import com.APIProject.apiProject.dto.SupporterDTO;
import org.springframework.stereotype.Service;

@Service
public class SupporterRestConverter implements RestConverter<Supporter, SupporterDTO.Response, SupporterDTO.Request> {

    @Override
    public SupporterDTO.Response toResponse(Supporter request) {
        SupporterDTO.Response entity = new SupporterDTO.Response();
        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setFirstSurname(request.getFirstSurname());
        entity.setSecondSurname(request.getSecondSurname());
        entity.setEmail(request.getEmail());
        entity.setId_service(request.getId_service());
        entity.setId_supervisor(request.getId_supervisor());
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
        entity.setId_service(request.getId_service());
        entity.setId_supervisor(request.getId_supervisor());
        entity.setPassword(request.getPassword());
        return entity;
    }
}
