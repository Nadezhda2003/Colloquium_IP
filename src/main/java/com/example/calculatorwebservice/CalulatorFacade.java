package com.example.calculatorwebservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;

import java.io.IOException;

public class CalulatorFacade {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String BaseUrl = "http://localhost:8080/api/calculate/";

    public double Add(double num1, double num2) throws IOException {
        HttpUriRequest request = new HttpGet(BaseUrl + "add/" + num1 + "/" + num2);
        var httpResponse = HttpClientBuilder.create().build().execute(request);
        var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
        return result;
    }

    public double Multiply(double num1, double num2) throws IOException {
        HttpUriRequest request = new HttpGet(BaseUrl + "multiply/" + num1 + "/" + num2);
        var httpResponse = HttpClientBuilder.create().build().execute(request);
        var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
        return result;
    }

    public double Minus(double num1, double num2) throws IOException {
        HttpUriRequest request = new HttpGet(BaseUrl + "minus/" + num1 + "/" + num2);
        var httpResponse = HttpClientBuilder.create().build().execute(request);
        var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
        return result;
    }

    public double Divide(double num1, double num2) throws IOException {
        HttpUriRequest request = new HttpGet(BaseUrl + "divide/" + num1 + "/" + num2);
        var httpResponse = HttpClientBuilder.create().build().execute(request);

        if (httpResponse.getCode() == HttpStatus.SC_BAD_REQUEST) {
            throw new IllegalArgumentException("Divide by zero");
        }

        var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
        return result;
    }
}