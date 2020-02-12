package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
@Table(name="notes")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String description;

    private Integer idSupport;

    private Integer idSupervisor;

    private Date noteTimestamp;

    private Integer idIssue;


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(Integer idSupport) {
        this.idSupport = idSupport;
    }

    public Integer getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Integer idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public Date getNoteTimestamp() {
        return noteTimestamp;
    }

    public void setNoteTimestamp(Date noteTimestamp) {
        this.noteTimestamp = noteTimestamp;
    }

    public Integer getIdIssue() {
        return idIssue;
    }

    public void setIdIssue(Integer idIssue) {
        this.idIssue = idIssue;
    }

    //toString
    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", idSupport=" + idSupport +
                ", idSupervisor=" + idSupervisor +
                ", noteTimestamp=" + noteTimestamp +
                ", idIssue=" + idIssue +
                '}';
    }
}
