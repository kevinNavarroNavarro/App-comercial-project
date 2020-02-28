package com.APIProject.apiProject.dto;

import java.util.List;

public class SupporterDTO {

    public static class Response{
        Integer id;

        String name;

        String firstSurname;

        String secondSurname;

        String email;

        String password;

        private List<Integer>  notes;

        private List<Integer>  Issues;

        ServiceDTO.Response service;

        SupervisorDTO.Response supervisor;

        String token;

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

        public List<Integer> getNotes() {
            return notes;
        }

        public void setNotes(List<Integer> notes) {
            this.notes = notes;
        }

        public List<Integer> getIssues() {
            return Issues;
        }

        public void setIssues(List<Integer> issues) {
            Issues = issues;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static class Request {
        Integer id;

        String name;

        String firstSurname;

        String secondSurname;

        String email;

        String password;

        private List<Integer>  notes;

        private List<Integer>  Issues;

        Integer service;

        Integer supervisor;

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

        public List<Integer> getNotes() {
            return notes;
        }

        public void setNotes(List<Integer> notes) {
            this.notes = notes;
        }

        public Integer getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(Integer supervisor) {
            this.supervisor = supervisor;
        }

        public List<Integer> getIssues() {
            return Issues;
        }

        public void setIssues(List<Integer> issues) {
            Issues = issues;
        }
    }
}