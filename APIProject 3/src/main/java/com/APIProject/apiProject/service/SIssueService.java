package com.APIProject.apiProject.service;


import com.APIProject.apiProject.domain.business.SIssue;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.SIssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SIssueService {
    @Autowired
    private SIssueRepository repository;

    public SIssue save(SIssue sIssue) {
            return repository.save(sIssue);
    }

    public SIssue update(SIssue sIssue) {
        find(sIssue.getId());
        return repository.save(sIssue);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<SIssue> findAll() {
        return repository.findAll();
    }

    public SIssue find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(SIssue.class.getName()));
    }
}









