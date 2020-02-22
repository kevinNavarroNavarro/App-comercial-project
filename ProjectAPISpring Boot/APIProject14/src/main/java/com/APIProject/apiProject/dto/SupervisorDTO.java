package com.APIProject.apiProject.dto;

import java.util.List;

public class SupervisorDTO {

    public static class Response {
        Integer id;

        String name;

        String firstSurname;

        String secondSurname;

        String email;

        String password;

        List<Integer> idNotes;

        SupporterDTO.Response supporter;

        SIssueDTO.Response issue;

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

        public SupporterDTO.Response getSupporter() {
            return supporter;
        }

        public void setSupporter(SupporterDTO.Response supporter) {
            this.supporter = supporter;
        }

        public SIssueDTO.Response getIssue() {
            return issue;
        }

        public void setIssue(SIssueDTO.Response issue) {
            this.issue = issue;
        }

    }

    public static class Request {
        Integer id;

        String name;

        String firstSurname;

        String secondSurname;

        String email;

        String password;

        List<Integer> idNotes;

        Integer supporter;

        Integer issue;

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

        public List<Integer> getIdNotes() {
            return idNotes;
        }

        public void setIdNotes(List<Integer> idNotes) {
            this.idNotes = idNotes;
        }

        public Integer getSupporter() {
            return supporter;
        }

        public void setSupporter(Integer supporter) {
            this.supporter = supporter;
        }

        public Integer getIssue() {
            return issue;
        }

        public void setIssue(Integer issue) {
            this.issue = issue;
        }
    }
}
