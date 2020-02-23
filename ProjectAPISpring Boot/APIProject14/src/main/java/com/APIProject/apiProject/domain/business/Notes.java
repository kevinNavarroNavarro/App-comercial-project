package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name= "Notes")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "supporter_id", nullable = false)
    private Supporter idSupport;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "supervisor_id",  nullable = false)
    private Supervisor idSupervisor;

    @NotNull
    @Column(name = "note_timestamp")
    private Date noteTimestamp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "issue_id", nullable = false)
    private SIssue idIssue;

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

    public Date getNoteTimestamp() {
        return noteTimestamp;
    }

    public void setNoteTimestamp(Date noteTimestamp) {
        this.noteTimestamp = noteTimestamp;
    }

    public Supporter getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(Supporter idSupport) {
        this.idSupport = idSupport;
    }

    public Supervisor getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Supervisor idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public SIssue getIdIssue() { return idIssue; }

    public void setIdIssue(SIssue idIssue) { this.idIssue = idIssue; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString
    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", idSupport=" + idSupport +
                ", idSupervisor=" + idSupervisor +
                ", noteTimestamp=" + noteTimestamp +
                ", idIssue=" + idIssue +
                '}';
    }
}
