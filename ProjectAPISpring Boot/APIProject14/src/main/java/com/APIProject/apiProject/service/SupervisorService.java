package com.APIProject.apiProject.service;

import com.APIProject.apiProject.domain.business.Supervisor;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupervisorService {

    @Autowired
    private SupervisorRepository repository;

    public Supervisor save(Supervisor supervisor) {
        try {
            return repository.save(supervisor);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
        return null;
    }

    public Supervisor update(Supervisor supervisor) {
        find(supervisor.getId());
        return repository.save(supervisor);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Supervisor> findAll() {
        return repository.findAll();
    }
    public List<Supervisor> findAllByDriver() {
        return repository.findAll();
    }

    public Supervisor find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        ()-> new RecordNotFoundException(Supervisor.class.getName()));
    }
}









