package com.mockdemo;

public class ServiceDemo {
    private final ExternalApi externalApi;

    public ServiceDemo(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData(String endpoint) {
        return externalApi.fetchData(endpoint);
    }
}
