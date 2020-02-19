package com.APIProject.apiProject.dto;

public class SupervisorDTO {

    public static class Response {
        Integer id;

        String name;

        String firstSurname;

        String secondSurname;

        String email;

        String password;

        ServiceDTO.Response idService;

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

        public ServiceDTO.Response getIdService() {
            return idService;
        }

        public void setIdService(ServiceDTO.Response idService) {
            this.idService = idService;
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

        Integer idService;

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

        public Integer getIdService() {
            return idService;
        }

        public void setIdService(Integer idService) {
            this.idService = idService;
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
