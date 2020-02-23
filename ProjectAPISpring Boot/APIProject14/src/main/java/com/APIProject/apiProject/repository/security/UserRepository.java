package com.APIProject.apiProject.repository.security;

import com.APIProject.apiProject.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}