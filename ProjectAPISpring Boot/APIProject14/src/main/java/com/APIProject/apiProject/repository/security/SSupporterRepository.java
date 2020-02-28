package com.APIProject.apiProject.repository.security;

import com.APIProject.apiProject.domain.business.Supporter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SSupporterRepository extends JpaRepository<Supporter, Integer> {
    Optional<Supporter> findByEmail(String email);
}