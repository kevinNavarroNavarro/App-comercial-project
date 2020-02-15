package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
@Table(name="Issue")
public class SIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "ReportNumber")
    private Integer reportNumber;

    @NotNull
    @Column(name = "Classification")
    @Size(max=10)
    private String classification;

    @NotNull
    @Column(name = "Status")
    @Size(max=15)
    private String status;

    @NotNull
    @Column(name = "ReportTimestamp")
    private Date reportTimeStamp;

    @NotNull
    @Column(name = "ResolutionComment")
    private String resolutionComment;

    @OneToMany(mappedBy = "idIssue", fetch = FetchType.LAZY)
    private List<Notes> notes;

    //@Column(name = "")
    private Integer idSupporter;

    //@Column(name = "second_surname")
    private Integer idSupervisor;


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReportTimeStamp() {
        return reportTimeStamp;
    }

    public void setReportTimeStamp(Date reportTimeStamp) {
        this.reportTimeStamp = reportTimeStamp;
    }

    public String getResolutionComment() {
        return resolutionComment;
    }

    public void setResolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
    }

    public int getIdSupporter() {
        return idSupporter;
    }

    public void setIdSupporter(int idSupporter) {
        this.idSupporter = idSupporter;
    }

    public int getIdSuppervisor() {
        return idSupervisor;
    }

    public void setIdSuppervisor(int idSuppervisor) {
        this.idSupervisor = idSuppervisor;
    }

    //toString
    @Override
    public String toString() {
        return "SIssue{" +
                "id=" + id +
                ", reportNumber=" + reportNumber +
                ", classification='" + classification + '\'' +
                ", status='" + status + '\'' +
                ", reportTimeStamp='" + reportTimeStamp + '\'' +
                ", resolutionComment='" + resolutionComment + '\'' +
                ", idSupporter=" + idSupporter +
                ", idSuppervisor=" + idSupervisor +
                '}';
    }
}