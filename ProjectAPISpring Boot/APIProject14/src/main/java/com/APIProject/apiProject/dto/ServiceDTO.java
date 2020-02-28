package com.APIProject.apiProject.dto;

import com.APIProject.apiProject.domain.business.Supporter;

import java.util.List;

public class ServiceDTO {

    public static class Response {
        private Integer id;

        private String name;

        private List<Supporter> supporter;

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

        public List<Supporter> getSupporter() {
            return supporter;
        }

        public void setSupporter(List<Supporter> supporter) {
            this.supporter = supporter;
        }
    }

    public static class Request{

        private Integer id;

        private String name;

        private List<Integer> Issues;

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

        public List<Integer> getIssues() {
            return Issues;
        }

        public void setIssues(List<Integer> issues) {
            Issues = issues;
        }
    }

}
