package com.louie.oodp_rest.data_class.AllStudentsSerializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.Course;

public class SectionAllStudents {
    @JsonProperty("csc200")
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
