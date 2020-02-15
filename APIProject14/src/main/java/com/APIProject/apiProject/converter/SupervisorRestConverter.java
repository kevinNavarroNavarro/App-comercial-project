package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Supervisor;
import com.APIProject.apiProject.dto.SupervisorDTO;
import com.APIProject.apiProject.service.SupervisorService;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.RouteMatcher;

@Service
public class SupervisorRestConverter implements RestConverter<Supervisor,
        SupervisorDTO.Response,
        SupervisorDTO.Request> {

    @Autowired
    private SupervisorService vehicleService;

    @Autowired
    private SupervisorRestConverter  supervisorConverter;


    @Override
    public SupervisorDTO.Response toResponse(Supervisor entity) {
        SupervisorDTO.Response response = new SupervisorDTO.Response();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setFirstSurname(entity.getFirstSurname());
        response.setSecondSurname(entity.getSecondSurname());
        response.setEmail(entity.getEmail());
        response.setPassword(entity.getPassword());
        return response;
    }

    @Override
    public Supervisor fromRequest(SupervisorDTO.Request request) {
        Supervisor entity = new Supervisor();
        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setFirstSurname(request.getFirstSurname());
        entity.setSecondSurname(request.getSecondSurname());
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        return entity;
    }
}
