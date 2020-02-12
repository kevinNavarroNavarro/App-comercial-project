package com.APIProject.apiProject.dto;

import java.sql.Timestamp;
import java.util.Date;

public class NotesDTO {

    Integer id;

    String description;

    Integer idSupport;

    Integer idSupervisor;

    Date noteTimestamp;

    Integer idIssue;

    public static class Request extends NotesDTO {
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

    }

    public static class Response extends NotesDTO {
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
    }
}
