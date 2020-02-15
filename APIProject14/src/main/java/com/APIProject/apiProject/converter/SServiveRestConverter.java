package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Notes;
import com.APIProject.apiProject.domain.business.Servive;
import com.APIProject.apiProject.dto.NotesDTO;
import com.APIProject.apiProject.dto.SServiveDTO;
import org.springframework.stereotype.Service;

@Service
public class SServiveRestConverter implements RestConverter<Servive, SServiveDTO.Response, SServiveDTO.Request> {

    @Override
    public SServiveDTO.Response toResponse(Servive entity) {
        SServiveDTO.Response dto = new SServiveDTO.Response();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Servive fromRequest(SServiveDTO.Request dto) {
        Servive entity = new Servive();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
