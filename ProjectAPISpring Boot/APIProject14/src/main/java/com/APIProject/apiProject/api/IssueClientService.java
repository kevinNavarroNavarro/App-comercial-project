package com.APIProject.apiProject.api;

import com.APIProject.apiProject.domain.business.SIssue;
import com.APIProject.apiProject.domain.model.SIssueModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class IssueClientService {

    @Autowired
    private RestTemplate restTemplate;

    private final String ROOT_URI = "http://192.168.1.101:59267/api/Issue/";

    public List<SIssueModel> finAll() {
        ResponseEntity<SIssueModel[]> response = restTemplate.getForEntity(ROOT_URI, SIssueModel[].class);
        return Arrays.asList(response.getBody());
    }

    public SIssueModel findById(int id) {
        ResponseEntity<SIssueModel> response =
                restTemplate.getForEntity(ROOT_URI
                        + "/" + id, SIssueModel.class);
        return response.getBody();
    }

    public SIssueModel add(SIssue person) {
        ResponseEntity<SIssueModel> response =
                restTemplate.postForEntity(ROOT_URI,
                        person, SIssueModel.class);
        return response.getBody();
    }

    public void update(SIssueModel issue, int id) {
        restTemplate
                .put(ROOT_URI+ "/" + id, issue, SIssueModel.class);
    }

    public void delete(Long id) {
        restTemplate.delete(ROOT_URI + id);

    }
}

