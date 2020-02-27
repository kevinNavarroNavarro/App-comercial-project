package com.APIProject.apiProject.api;

import com.APIProject.apiProject.domain.business.SIssue;
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

    private final String ROOT_URI = "http://192.168.1.101:59267";

    public List<SIssue> finAll() {
        ResponseEntity<SIssue[]> response = restTemplate.getForEntity(ROOT_URI, SIssue[].class);
        return Arrays.asList(response.getBody());
    }

    public SIssue findById(Long id) {
        ResponseEntity<SIssue> response =
                restTemplate.getForEntity(ROOT_URI
                        + "/" + id, SIssue.class);
        return response.getBody();
    }

    public SIssue add(SIssue person) {
        ResponseEntity<SIssue> response =
                restTemplate.postForEntity(ROOT_URI,
                        person, SIssue.class);
        return response.getBody();
    }

    public void update(SIssue issue, Long id) {
        restTemplate
                .put(ROOT_URI+ "/" + id, issue, SIssue.class);
    }

    public void delete(Long id) {
        restTemplate.delete(ROOT_URI + id);

    }
}

