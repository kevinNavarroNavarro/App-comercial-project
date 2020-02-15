package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="Supporter")
public class Supporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "Name")
    private String name;

    @NotNull
    @Column(name = "FirstSurname")
    private String firstSurname;

    @NotNull
    @Column(name = "SecondSurname")
    private String secondSurname;

    @NotNull
    @Column(name = "Email")
    @Email
    private String email;

    @NotNull
    @Column(name = "Password")
    private String password;

    @OneToMany(mappedBy = "idSupport", fetch = FetchType.LAZY)
    private List<Notes> notes;

    private String id_service;

    private String id_supervisor;

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_service() {
        return id_service;
    }

    public void setId_service(String id_service) {
        this.id_service = id_service;
    }

    public String getId_supervisor() {
        return id_supervisor;
    }

    public void setId_supervisor(String id_supervisor) {
        this.id_supervisor = id_supervisor;
    }


    // toString
    @Override
    public String toString() {
        return "Supporter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id_service='" + id_service + '\'' +
                ", id_supervisor='" + id_supervisor + '\'' +
                '}';
    }
}