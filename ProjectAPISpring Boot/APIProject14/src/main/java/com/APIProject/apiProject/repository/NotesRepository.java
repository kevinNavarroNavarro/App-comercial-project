package com.APIProject.apiProject.repository;

import com.APIProject.apiProject.domain.business.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Integer> {

}
