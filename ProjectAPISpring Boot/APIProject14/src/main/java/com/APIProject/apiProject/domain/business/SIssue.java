package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Issue")
public class SIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "report_number")
    private Integer reportNumber;

    @NotNull
    @Column(name = "classification")
    @Size(max=10)
    private String classification;

    @NotNull
    @Column(name = "status")
    @Size(max=15)
    private String status;

    @NotNull
    @Column(name = "report_timestamp")
    private Date reportTimeStamp;

    @NotNull
    @Column(name = "resolution_comment")
    private String resolutionComment;

    @OneToMany(mappedBy = "idIssue", fetch = FetchType.LAZY)
    private List<Notes> notes;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "supervisor_id", nullable = false)
    private Supervisor supervisor;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "supporter_id", nullable = false)
    private Supporter supporter;

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

    public void setReportNumber(Integer reportNumber) {
        this.reportNumber = reportNumber;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public Supporter getSupporter() {
        return supporter;
    }

    public void setSupporter(Supporter supporter) {
        this.supporter = supporter;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    //toString
    @Override
    public String toString() {
        return "SIssue{" +
                "id=" + id +
                ", reportNumber=" + reportNumber +
                ", classification='" + classification + '\'' +
                ", status='" + status + '\'' +
                ", reportTimeStamp=" + reportTimeStamp +
                ", resolutionComment='" + resolutionComment + '\'' +
                ", notes=" + notes +
                ", supporter=" + supporter +
                ", supervisor=" + supervisor +
                '}';
    }
}