package com.louie.oodp_rest.adapter;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.louie.oodp_rest.data_class.Student;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class REST_FETCH {
    private static final String baseURL = "http://127.0.0.1:3000";
    private static final HttpClient client = HttpClient.newHttpClient();

    private static HttpResponse<String> sendRequest(HttpRequest request) throws IOException, InterruptedException {

        return REST_FETCH.client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public static Student getStudent() throws IOException, InterruptedException, URISyntaxException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        TypeReference<List<Student>> typeReference = new TypeReference<>() {};

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(baseURL + "/students/?id=1000"))
                .GET()
                .build();

        HttpResponse<String> response = sendRequest(request);
        return mapper.readValue(response.body(), typeReference).get(0);
    }

    public static List<Student> getAllData() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        TypeReference<List<Student>> typeReference = new TypeReference<>() {};

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(baseURL + "/students/"))
                    .GET()
                    .build();

            HttpResponse<String> response = sendRequest(request);

            return mapper.readValue(response.body(), typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
