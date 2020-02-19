package com.APIProject.apiProject.dto;

import com.APIProject.apiProject.domain.business.Supporter;

public class ServiceDTO {

    public static class Response {
        private Integer id;

        private String name;

        private SupporterDTO.Response supporter;

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

        public SupporterDTO.Response getSupporter() {
            return supporter;
        }

        public void setSupporter(SupporterDTO.Response supporter) {
            this.supporter = supporter;
        }
    }

    public static class Request{

        private Integer id;

        private String name;

        private Integer supporter;

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

        public Integer getSupporter() {
            return supporter;
        }

        public void setSupporter(Integer supporter) {
            this.supporter = supporter;
        }
    }

}
