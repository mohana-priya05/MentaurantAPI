package com.mentaurantpro.mentaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

//@Data
//@NoArgsConstructor
public class Response {
    private HttpStatus status;
    private String message;
    private Object data;

    public HttpStatus getStatus() {
        return status;
    }



    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Response(HttpStatus status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Response(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
    public Response() {
    }
}
