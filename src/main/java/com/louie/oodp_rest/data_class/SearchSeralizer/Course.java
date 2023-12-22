package com.louie.oodp_rest.data_class.SearchSeralizer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Course {
    @JsonProperty("total_students")
    private int totalStudents;

    @JsonProperty("data")
    private Data data;

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
