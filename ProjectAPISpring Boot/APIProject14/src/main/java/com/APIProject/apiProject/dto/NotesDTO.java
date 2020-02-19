package com.APIProject.apiProject.dto;

import java.util.Date;

public class NotesDTO {

    public static class Request {
        private Integer id;

        private String description;

        private Integer idSupport;

        private Integer idSupervisor;

        private Date noteTimestamp;

        private Integer idIssue;

        private String Name;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

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

    public static class Response{
        private Integer id;

        private String description;

        private Date noteTimestamp;

        private SIssueDTO.Response sIssue;

        private SupervisorDTO.Response supervisor;

        private SupporterDTO.Response supporter;

        private String Name;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

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

        public SIssueDTO.Response getsIssue() {
            return sIssue;
        }

        public void setsIssue(SIssueDTO.Response sIssue) {
            this.sIssue = sIssue;
        }

        public SupervisorDTO.Response getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(SupervisorDTO.Response supervisor) {
            this.supervisor = supervisor;
        }

        public SupporterDTO.Response getSupporter() {
            return supporter;
        }

        public void setSupporter(SupporterDTO.Response supporter) {
            this.supporter = supporter;
        }
    }
}
