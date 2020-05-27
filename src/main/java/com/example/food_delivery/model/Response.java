package com.example.food_delivery.model;

public class Response {
    private int code; // 200, 300, 400, 502, ...
    private String status;
    private boolean isSuccess;
    private Object results;

    public Response(int code, String status, boolean isSuccess, Object results) {
        this.code = code;
        this.status = status;
        this.isSuccess = isSuccess;
        this.results = results;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }

}