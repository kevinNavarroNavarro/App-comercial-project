package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="Supervisor")
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String firstSurname;

    private String secondSurname;

    @Email
    private String email;

    private String password;

    private Integer idService;

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

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    //toString

    @Override
    public String toString() {
        return "Supervisor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", idService=" + idService +
                '}';
    }
}
