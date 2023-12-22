package com.louie.oodp_rest.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.SectionAllStudents;
import com.louie.oodp_rest.data_class.SearchSeralizer.SectionSearchStudent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class REST_FETCH {
    private static  final String baseURL = "http://127.0.0.1:8000";
    private static final HttpClient client = HttpClient.newHttpClient();

    private static HttpResponse<String> sendRequest(HttpRequest request) throws IOException, InterruptedException {

        return REST_FETCH.client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public static SectionSearchStudent getStudent(String studentName) throws IOException, InterruptedException, URISyntaxException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(baseURL + "/api/student/search?search=" + studentName))
                .GET()
                .build();

        HttpResponse<String> response = sendRequest(request);
        return mapper.readValue(response.body(), SectionSearchStudent.class);
    }

    public static SectionAllStudents getAllData() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(baseURL + "/api/all"))
                    .GET()
                    .build();

            HttpResponse<String> response = sendRequest(request);

            return mapper.readValue(response.body(), SectionAllStudents.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
