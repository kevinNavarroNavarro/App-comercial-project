package com.APIProject.apiProject.dto;

public class SupporterDTO {

    Integer id;

    String name;

    String firstSurname;

    String secondSurname;

    String email;

    String password;

    String id_service;

    String id_supervisor;


    public static class Response extends SupporterDTO {
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

        public String getId_service() {
            return id_service;
        }

        public void setId_service(String id_service) {
            this.id_service = id_service;
        }

        public String getId_supervisor() {
            return id_supervisor;
        }

        public void setId_supervisor(String id_supervisor) {
            this.id_supervisor = id_supervisor;
        }
    }

    public static class Request extends SupporterDTO {
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

        public String getId_service() {
            return id_service;
        }

        public void setId_service(String id_service) {
            this.id_service = id_service;
        }

        public String getId_supervisor() {
            return id_supervisor;
        }

        public void setId_supervisor(String id_supervisor) {
            this.id_supervisor = id_supervisor;
        }
    }
}