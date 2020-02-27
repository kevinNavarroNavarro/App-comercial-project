package com.APIProject.apiProject.exceptions;

import java.util.Date;
import static com.APIProject.apiProject.util.JsonUtil.toJson;

public class ErrorDetailsClientAPI {
    private Date timestamp;
    private String message;
    private String details;


    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return toJson(this);
    }
}