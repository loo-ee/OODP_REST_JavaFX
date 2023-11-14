package com.louie.oodp_rest.data_class.AllStudentsSerializer;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private final Map<String, SectionData> sections = new HashMap<>();

    @JsonAnyGetter
    public Map<String, SectionData> getSections() {
        return sections;
    }

    @JsonAnySetter
    public void setSections(String sectionName, SectionData sectionData) {
        sections.put(sectionName, sectionData);
    }
}
