package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Notes;
import com.APIProject.apiProject.domain.business.SServive;
import com.APIProject.apiProject.dto.NotesDTO;
import com.APIProject.apiProject.dto.SServiveDTO;
import org.springframework.stereotype.Service;

@Service
public class SServiveRestConverter implements RestConverter<SServive, SServiveDTO.Response, SServiveDTO.Request> {

    @Override
    public SServiveDTO.Response toResponse(SServive entity) {
        SServiveDTO.Response dto = new SServiveDTO.Response();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public SServive fromRequest(SServiveDTO.Request dto) {
        SServive entity = new SServive();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
