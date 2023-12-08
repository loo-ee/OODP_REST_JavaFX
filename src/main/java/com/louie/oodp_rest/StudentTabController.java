package com.louie.oodp_rest;

import com.louie.oodp_rest.data_class.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class StudentTabController implements Initializable {
    @FXML private ListView<String> studentInfoListView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Student foundStudent = HomePageController.foundStudent;

        studentInfoListView.getItems().add("ID: " + foundStudent.getId());
        studentInfoListView.getItems().add("Name: " + foundStudent.getName());

        studentInfoListView.getStylesheets().add(Objects.requireNonNull(Objects.requireNonNull
                (getClass().getResource("styles/student_info_list_view.css")).toExternalForm()));
    }
}
