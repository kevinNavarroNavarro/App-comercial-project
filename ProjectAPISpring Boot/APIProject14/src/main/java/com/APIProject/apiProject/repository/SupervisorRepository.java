package com.APIProject.apiProject.repository;

import com.APIProject.apiProject.domain.business.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SupervisorRepository extends JpaRepository<Supervisor, Integer> {
        Optional<Supervisor> findByEmail(String email);

        @Query("SELECT s FROM Supervisor s where s.email=:email")
        Supervisor findEmail(@Param("email") String email);
}

