package com.APIProject.apiProject.dto;

public class SupporterDTO {

    public static class Response{
        Integer id;

        String name;

        String firstSurname;

        String secondSurname;

        String email;

        String password;

        ServiceDTO.Response service;

        SupervisorDTO.Response supervisor;

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

        public ServiceDTO.Response getService() {
            return service;
        }

        public void setService(ServiceDTO.Response service) {
            this.service = service;
        }

        public SupervisorDTO.Response getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(SupervisorDTO.Response supervisor) {
            this.supervisor = supervisor;
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

        Integer service;

        Integer supervisor;

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

        public Integer getService() {
            return service;
        }

        public void setService(Integer service) {
            this.service = service;
        }

        public Integer getSupporter() {
            return supervisor;
        }

        public void setSupporter(Integer supporter) {
            this.supervisor = supporter;
        }

        public Integer getIssue() {
            return issue;
        }

        public void setIssue(Integer issue) {
            this.issue = issue;
        }
    }
}