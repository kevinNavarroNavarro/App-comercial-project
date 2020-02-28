package com.APIProject.apiProject.service.security;

import com.APIProject.apiProject.domain.business.Supervisor;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.security.SSupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SupervisorService implements UserDetailsService {

    @Autowired
    private SSupervisorRepository repository;

    public Supervisor save(Supervisor user) {
        return repository.save(user);
    }

    public Supervisor update(Supervisor user) {
        find(user.getId());
        return repository.save(user);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Supervisor> findAll() {
        return repository.findAll();
    }


    public Supervisor find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Supervisor.class, id));
    }

    public Optional<Supervisor> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supervisor user = findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not exists"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList());
    }
}
