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

        List<Integer> Supporters;

        List<Integer> idNotes;

        List<Integer> Issues;

        String token;

        private List<Integer> notes;

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

        public List<Integer> getIssues() {
            return Issues;
        }

        public void setIssues(List<Integer> issues) {
            Issues = issues;
        }

        public List<Integer> getNotes() {
            return notes;
        }

        public void setNotes(List<Integer> notes) {
            this.notes = notes;
        }

        public List<Integer> getSupporters() {
            return Supporters;
        }

        public void setSupporters(List<Integer> supporters) {
            Supporters = supporters;
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

        List<Integer> Supporters;

        List<Integer> idNotes;

        List<Integer> Issues;

        private List<Integer> notes;

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

        public List<Integer> getIssues() {
            return Issues;
        }

        public void setIssues(List<Integer> issues) {
            Issues = issues;
        }

        public List<Integer> getNotes() {
            return notes;
        }

        public void setNotes(List<Integer> notes) {
            this.notes = notes;
        }

        public List<Integer> getSupporters() {
            return Supporters;
        }

        public void setSupporters(List<Integer> supporters) {
            Supporters = supporters;
        }
    }
}
