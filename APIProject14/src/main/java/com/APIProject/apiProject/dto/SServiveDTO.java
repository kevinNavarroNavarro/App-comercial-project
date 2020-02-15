package com.APIProject.apiProject.dto;

import com.APIProject.apiProject.domain.business.Servive;

public class SServiveDTO {



    public static class Request extends SServiveDTO {

        private Integer id;

        private String name;

        private Integer idServive;


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
    }

    public static class Response extends SServiveDTO {

        private Integer id;

        private String name;

        private SServiveDTO.Response idServive ;

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

        public Response getIdServive() {
            return idServive;
        }

        public void setIdServive(Response idServive) {
            this.idServive = idServive;
        }
    }

}
