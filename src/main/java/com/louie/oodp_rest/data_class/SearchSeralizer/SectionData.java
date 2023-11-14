package com.louie.oodp_rest.data_class.SearchSeralizer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.louie.oodp_rest.data_class.Student;

import java.util.List;

public class SectionData {
    @JsonProperty("Section A")
    private List<Student> sectionA;

    public List<Student> getSectionA() {
        return sectionA;
    }

    public void setSectionA(List<Student> sectionA) {
        this.sectionA = sectionA;
    }
}
