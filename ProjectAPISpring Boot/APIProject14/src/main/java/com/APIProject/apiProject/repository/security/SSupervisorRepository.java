package com.APIProject.apiProject.repository.security;

import com.APIProject.apiProject.domain.business.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SSupervisorRepository extends JpaRepository<Supervisor, Integer> {
    Optional<Supervisor> findByEmail(String email);
}