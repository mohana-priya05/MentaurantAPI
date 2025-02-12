package com.mentaurantpro.mentaurant.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class APIResponseDTO {

    private String status;
    private Integer responseCode;
    private String message;
    private Object data;

    @JsonIgnore
    private String contentType;

    @JsonIgnore
    private String responseInJSON;



    public APIResponseDTO(String status, Integer responseCode, String message, Object responseObject,
                          String responseInJSON) {
        super();
        this.status = status;
        this.responseCode = responseCode;
        this.message = message;
        this.data = responseObject;
        this.responseInJSON = responseInJSON;
    }

    public APIResponseDTO(String status, Integer responseCode, String message, Object responseObject,
                          String responseInJSON, String contentType) {
        super();
        this.status = status;
        this.responseCode = responseCode;
        this.message = message;
        this.data = responseObject;
        this.responseInJSON = responseInJSON;
        this.contentType = contentType;
    }

    public APIResponseDTO(String status, Integer responseCode, String message) {
        super();
        this.status = status;
        this.responseCode = responseCode;
        this.message = message;
    }

    public APIResponseDTO(String status, Integer responseCode, Object data) {
        super();
        this.status = status;
        this.responseCode = responseCode;
        this.data = data;
    }

    public APIResponseDTO(String status, Integer responseCode, String message, Object data) {
        super();
        this.status = status;
        this.responseCode = responseCode;
        this.message = message;
        this.data = data;
    }

}
