package com.louie.oodp_rest.data_class.AllStudentsSerializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.louie.oodp_rest.data_class.Student;

import java.util.List;

public class SectionData {
    @JsonProperty("total_students")
    private int totalStudents;

    @JsonProperty("data")
    private List<Student> data;

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }
}
