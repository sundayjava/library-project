package com.luv2code.springbootlibrary.requestmodels;

public class AdminQuestionRequest {
    private Long id;
    private String response;

    public AdminQuestionRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
