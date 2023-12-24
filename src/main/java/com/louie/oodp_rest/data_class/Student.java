package com.louie.oodp_rest.data_class;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Student {
    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("attendance")
    private List<Attendance> attendance;

    public Student() {}

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public List<Attendance> getAttendance() {
        return attendance;
    }

    public void setAttendance(List<Attendance> attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
