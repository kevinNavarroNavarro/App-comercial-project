package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="Supervisor")
public class Supervisor {
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
    @Email
    @Column(name = "Email")
    private String email;

    @NotNull
    @Column(name = "Password")
    private String password;

    @OneToMany(mappedBy = "idSupervisor", fetch = FetchType.LAZY)
    private List<Notes> notes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idServive", nullable = false)
    private Servive idService;

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

    public Servive getIdService() { return idService; }

    public void setIdService(Servive idService) {
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
