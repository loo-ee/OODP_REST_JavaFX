package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.Course;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.SectionAllStudents;
import com.louie.oodp_rest.data_class.AllStudentsSerializer.SectionData;
import com.louie.oodp_rest.data_class.SearchSeralizer.SectionSearchStudent;
import com.louie.oodp_rest.data_class.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;

public class HomePageController implements Initializable {
    @FXML private ListView<String> modeListView;

    @FXML private ListView studentListView;

    private static SectionSearchStudent sectionSearchStudent;
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

                    Course course = sectionAllStudents.getCourse();
                    ArrayList<String> studentsData = new ArrayList<>();

                    if (course == null)
                        return;

                    for (String sectionKey: course.getSections().keySet()) {
                        SectionData currentSectionData = course.getSections().get(sectionKey);

                        for (Student currentStudent: currentSectionData.getData()) {
                            studentsData.add(sectionKey + " -> " + currentStudent);
                        }
                    }

                    Collections.sort(studentsData);
                    studentListView.getItems().addAll(studentsData);

                    studentListView.getStylesheets().add(Objects.requireNonNull(Objects.requireNonNull
                            (getClass().getResource("styles/student_info_list_view.css")).toExternalForm()));
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