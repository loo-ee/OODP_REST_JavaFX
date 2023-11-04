package com.louie.oodp_rest.data_class;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Student {
    @JsonProperty("status")
    private boolean status;

    @JsonProperty("id")
    private long id;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("date")
    private LocalDate date;

    public Student() {}

    public Student(boolean status, long id, String firstName, String lastName, LocalDate date) {
        this.status = status;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean getStatus() {
        return this.status;
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName;
    }
}
