package com.APIProject.apiProject.repository;

import com.APIProject.apiProject.domain.business.Supporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SupporterRepository extends JpaRepository<Supporter, Integer> {
    Optional<Supporter> findByEmail(String email);

    @Query("SELECT s FROM Supporter s where s.email=:email")
    Supporter findEmail(@Param("email") String email);
}
