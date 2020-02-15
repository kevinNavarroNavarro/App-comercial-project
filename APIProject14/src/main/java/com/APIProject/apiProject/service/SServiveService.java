package com.APIProject.apiProject.service;

import com.APIProject.apiProject.domain.business.Servive;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.SServiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SServiveService {
    @Autowired
    private SServiveRepository repository;

    public Servive save(Servive sServive) {
        return repository.save(sServive);
    }

    public Servive update(Servive sServive) {
        find(sServive.getId());
        return repository.save(sServive);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Servive> findAll() {
        return repository.findAll();
    }


    public Servive find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Servive.class.getName()));
    }
}









