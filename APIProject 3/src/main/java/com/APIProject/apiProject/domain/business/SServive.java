package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Notes")
public class SServive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    //Getters and setters
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

    @Override
    public String toString() {
        return "SServive{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
