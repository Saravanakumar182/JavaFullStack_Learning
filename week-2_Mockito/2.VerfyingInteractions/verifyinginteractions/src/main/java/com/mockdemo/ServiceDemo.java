package com.mockdemo;

public class ServiceDemo {
    private final ExternalApi externalApi;

    public ServiceDemo(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processData() {
        externalApi.fetchData("/users/data");
    }
}