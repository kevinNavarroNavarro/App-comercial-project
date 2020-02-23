package com.APIProject.apiProject.service.security;

import com.APIProject.apiProject.domain.security.User;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User update(User user) {
        find(user.getId());
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<User> findAll() {
        return repository.findAll();
    }


    public User find(Long id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(User.class, id));
    }

    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not exists"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList());
    }
}
