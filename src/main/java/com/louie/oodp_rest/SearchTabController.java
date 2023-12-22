package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
import com.louie.oodp_rest.data_class.Student;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SearchTabController {
    @FXML private TextField searchTextField;
    @FXML private AnchorPane resultsPane;

    public void findStudent() throws IOException, URISyntaxException, InterruptedException {
        String studentName = searchTextField.getText();
        String cleanedStudentName = studentName.replace(" ", "%20");
        Map<String, List<Student>> students = REST_FETCH.getStudent(cleanedStudentName).getCourse().getData().getSections();

        // TODO: Create a list for displaying search results
        ListView<String> resultsListView = new ListView<>();
        ArrayList<String> foundStudents = new ArrayList<>();

        students.forEach((student, sect) -> {
            sect.forEach(stud -> {
                foundStudents.add(stud.toString());
            });
        });
        resultsListView.getItems().addAll(foundStudents);
        resultsListView.getSelectionModel().selectedItemProperty().addListener(clicked -> {
            String selectedItem = resultsListView.getSelectionModel().getSelectedItem();

            students.forEach((student, sect) -> {
                sect.forEach(stud -> {
                    if (stud.toString().equals(selectedItem)) {
                        HomePageController.foundStudent = stud;
                        HomePageController.showStudentTab();
                    }
                });
            });
        });

        resultsPane.getChildren().add(resultsListView);
    }
}
