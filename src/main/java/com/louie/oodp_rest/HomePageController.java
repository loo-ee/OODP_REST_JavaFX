package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.Course;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.SectionAllStudents;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.SectionData;
import com.louie.oodp_rest.data_class.SearchSeralizer.SectionSearchStudent;
import com.louie.oodp_rest.data_class.Student;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class HomePageController implements Initializable {
    @FXML private ListView<String> modeListView;

    @FXML private TabPane recordsTabPane;

    private static SectionAllStudents sectionAllStudents;
    public static Student foundStudent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        modeListViewInit();
    }

    private void modeListViewInit() {
        String[] modes = {
              "[GET] ALL",
              "[GET] Search"
        };

        modeListView.getItems().addAll(modes);

        modeListView.getSelectionModel().selectedItemProperty().addListener(observable -> {
            int index = modeListView.getSelectionModel().getSelectedIndex();

            switch (index) {
                case 0 -> {
                    fetchAllStudents();
                    recordsTabPane.getTabs().clear();
                    Course course = sectionAllStudents.getCourse();

                    if (course == null)
                        return;

                    for (String sectionKey: course.getSections().keySet()) {
                        SectionData currentSectionData = course.getSections().get(sectionKey);
                        ArrayList<String> studentsData = new ArrayList<>();

                        Tab tab = new Tab();
                        ListView<String> studentListView = new ListView<>();

                        for (Student currentStudent: currentSectionData.getData()) {
                            studentsData.add(currentStudent.toString());
                        }

                        Collections.sort(studentsData);
                        studentListView.getItems().addAll(studentsData);
                        studentListView.getSelectionModel().selectedItemProperty().addListener(clicked -> {
                            String query = studentListView.getSelectionModel().getSelectedItem();

                            String cleanedStudentName = query.replace(" ", "%20");
                            final Student[] foundStudent = {null};
                            try {
                                Map<String, List<Student>> students = REST_FETCH.getStudent(cleanedStudentName).getCourse().getData().getSections();

                                students.forEach((section, studentsList) -> {
                                    studentsList.forEach(s -> {
                                        if (s.toString().equals(query)) {
                                            foundStudent[0] = s;
                                        }
                                    });
                                });
                            } catch (IOException | InterruptedException | URISyntaxException e) {
                                throw new RuntimeException(e);
                            }

                            if (foundStudent[0] != null) {
                                HomePageController.foundStudent = foundStudent[0];
                                HomePageController.showStudentTab();
                            }
                        });
                        studentListView.getStylesheets().add(Objects.requireNonNull(Objects.requireNonNull
                                (getClass().getResource("styles/student_info_list_view.css")).toExternalForm()));

                        tab.setText(sectionKey);
                        tab.setContent(studentListView);
                        recordsTabPane.getTabs().add(tab);
                        recordsTabPane.getTabs().sort((Comparator.comparing(Tab::getText)));
                    }
                }

                case 1 -> {
                    showSearchTab();
                }
            }
        });
    }

    private void fetchAllStudents() {
        sectionAllStudents = REST_FETCH.getAllData();
    }

    private void showSearchTab() {
        try {
            Parent searchTabRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/louie/oodp_rest/search-tab.fxml")));
            Stage seachTabStage = new Stage();
            Scene seachTabScene = new Scene(searchTabRoot);

            seachTabStage.setScene(seachTabScene);
            seachTabStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showStudentTab() {
        try {
            Parent studentTabRoot = FXMLLoader.load(Objects.requireNonNull(HomePageController.class.getResource("/com/louie/oodp_rest/student-tab.fxml")));
            Stage studentTabStage = new Stage();
            Scene studentTabScene = new Scene(studentTabRoot);

            studentTabStage.setScene(studentTabScene);
            studentTabStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}