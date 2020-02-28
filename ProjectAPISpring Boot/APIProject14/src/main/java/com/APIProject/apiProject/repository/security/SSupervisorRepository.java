//package com.APIProject.apiProject.repository.security;
//
//import com.APIProject.apiProject.domain.business.Supervisor;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface SSupervisorRepository extends JpaRepository<Supervisor, Integer> {
//    @Query("SELECT s FROM Supervisor s where s.id=:email")
////    List<IssueClient> findAllByUser(@Param("id_user") Integer id_user); //issue_client
//    Supervisor findByEmail(@Param("email") String email);
//}