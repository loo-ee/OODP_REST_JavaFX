package com.louie.oodp_rest.data_class.SearchSeralizer;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.louie.oodp_rest.data_class.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private final Map<String, List<Student>> sections = new HashMap<>();

    @JsonAnyGetter
    public Map<String , List<Student>> getSections() {
        return sections;
    }

    @JsonAnySetter
    public void setSections(String sectionName, List<Student> studentsList) {
        sections.put(sectionName, studentsList);
    }
}
