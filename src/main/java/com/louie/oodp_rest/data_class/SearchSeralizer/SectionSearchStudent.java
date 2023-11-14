package com.louie.oodp_rest.data_class.SearchSeralizer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SectionSearchStudent {
    @JsonProperty("csc200")
    private Course course;

    public SectionSearchStudent() {}
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
