package com.APIProject.apiProject.dto;

import java.util.Date;

public class SIssueDTO {

    Integer id;

    Integer reportNumber;

    String classification;

    String status;

    Date reportTimeStamp;

    String resolutionComment;

    Integer idSupporter;

    Integer idSupervisor;


    public static class Request extends SIssueDTO {
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getReportNumber() {
            return reportNumber;
        }

        public void setReportNumber(Integer reportNumber) {
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

        public Integer getIdSupporter() {
            return idSupporter;
        }

        public void setIdSupporter(Integer idSupporter) {
            this.idSupporter = idSupporter;
        }

        public Integer getIdSupervisor() {
            return idSupervisor;
        }

        public void setIdSupervisor(Integer idSupervisor) {
            this.idSupervisor = idSupervisor;
        }
    }

    public static class Response extends SIssueDTO {
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getReportNumber() {
            return reportNumber;
        }

        public void setReportNumber(Integer reportNumber) {
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

        public Integer getIdSupporter() {
            return idSupporter;
        }

        public void setIdSupporter(Integer idSupporter) {
            this.idSupporter = idSupporter;
        }

        public Integer getIdSupervisor() {
            return idSupervisor;
        }

        public void setIdSupervisor(Integer idSupervisor) {
            this.idSupervisor = idSupervisor;
        }
    }

}
