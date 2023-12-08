package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
import com.louie.oodp_rest.data_class.Student;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URISyntaxException;

public class SearchTabController {
    @FXML private TextField searchTextField;

    public void findStudent() throws IOException, URISyntaxException, InterruptedException {
        String studentName = searchTextField.getText();
        String cleanedStudentName = studentName.replace(" ", "%20");
        Student foundStudent = REST_FETCH.getStudent(cleanedStudentName).getCourse().getData().getSectionA().get(0);

        if (foundStudent == null)
            return;

        HomePageController.foundStudent = foundStudent;
        HomePageController.showStudentTab();
    }
}
