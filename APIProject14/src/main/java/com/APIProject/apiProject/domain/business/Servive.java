package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="Servive")
public class Servive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "Name")
    private String name;

//    @OneToMany(mappedBy = "idService", fetch = FetchType.LAZY)
//    private List<Servive> service;

    //Getters and setters
    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Servive{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
