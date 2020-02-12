package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.Notes;
import com.APIProject.apiProject.dto.NotesDTO;
import org.springframework.stereotype.Service;

@Service
public class NotesRestConverter implements RestConverter<Notes, NotesDTO.Response, NotesDTO.Request> {

    @Override
    public NotesDTO.Response toResponse(Notes entity) {
        NotesDTO.Response dto = new NotesDTO.Response();
        dto.setId(entity.getId());
        dto.setIdIssue(entity.getIdIssue());
        dto.setDescription(entity.getDescription());
        dto.setIdSupervisor(entity.getIdSupervisor());
        dto.setIdSupport(entity.getIdSupport());
        dto.setNoteTimestamp(entity.getNoteTimestamp());
        return dto;
    }

    @Override
    public Notes fromRequest(NotesDTO.Request dto) {
        Notes entity = new Notes();
        entity.setId(dto.getId());
        entity.setIdIssue(dto.getIdIssue());
        entity.setDescription(dto.getDescription());
        entity.setIdSupervisor(dto.getIdSupervisor());
        entity.setIdSupport(dto.getIdSupport());
        entity.setNoteTimestamp(dto.getNoteTimestamp());
        return entity;
    }
}
