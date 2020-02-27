package com.APIProject.apiProject.service;

import com.APIProject.apiProject.domain.business.SService;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.SServiveRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class SServiveService {
    @Autowired
    private SServiveRepository repository;

    public SService save(SService sService) {
        return repository.save(sService);
    }

    public SService update(SService sService) {
        find(sService.getId());
        return repository.save(sService);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<SService> findAll() {
        return repository.findAll();
    }


    public SService find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(SService.class, id));
    }
}









