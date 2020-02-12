package com.APIProject.apiProject.service;

import com.APIProject.apiProject.domain.business.SServive;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.SServiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SServiveService {
    @Autowired
    private SServiveRepository repository;

    public SServive save(SServive sServive) {
        return repository.save(sServive);
    }

    public SServive update(SServive sServive) {
        find(sServive.getId());
        return repository.save(sServive);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<SServive> findAll() {
        return repository.findAll();
    }


    public SServive find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(SServive.class.getName()));
    }
}









