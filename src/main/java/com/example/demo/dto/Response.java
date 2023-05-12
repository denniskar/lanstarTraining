package com.example.demo.dto;

import lombok.Data;

@Data
public class Response {
    String message;

    public  static Response success(String msg){
        Response response = new Response();
        response.setMessage(msg);
        return response;
    }
    public  static Response failure(String msg){
        Response response = new Response();
        response.setMessage(msg);
        return response;
    }
}
