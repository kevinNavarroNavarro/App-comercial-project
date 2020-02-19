package com.APIProject.apiProject.service;

import com.APIProject.apiProject.domain.business.Notes;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotesService {

    @Autowired
    private NotesRepository repository;

    public Notes save(Notes notes) {
        return repository.save(notes);
    }

    public Notes update(Notes notes) {
        find(notes.getId());
        return repository.save(notes);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Notes> findAll() {
        return repository.findAll();
    }

    public Notes find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Notes.class.getName()));
    }
}









