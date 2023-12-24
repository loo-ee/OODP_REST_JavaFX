package com.louie.oodp_rest.data_class;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Attendance {
    @JsonProperty("is_present")
    private boolean isPresent;

    @JsonProperty("date")
    private LocalDate date;

    Attendance() {}

    public Attendance(boolean is_present, LocalDate date) {
        this.isPresent = is_present;
        this.date = date;
    }

    public boolean getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
       return "Date: " + this.getDate().toString() + "\nIs present: " + this.isPresent + "\n\n";
    }
}
