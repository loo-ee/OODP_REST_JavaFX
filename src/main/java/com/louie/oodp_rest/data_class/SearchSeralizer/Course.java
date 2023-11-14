package com.louie.oodp_rest.data_class.SearchSeralizer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    @JsonProperty("total_students")
    private int totalStudents;

    @JsonProperty("data")
    private SectionData data;

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public SectionData getData() {
        return data;
    }

    public void setData(SectionData data) {
        this.data = data;
    }
}
