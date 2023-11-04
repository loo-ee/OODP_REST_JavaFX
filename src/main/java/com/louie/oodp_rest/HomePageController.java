package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
import com.louie.oodp_rest.data_class.Student;
import com.louie.oodp_rest.settings.ProjectSettings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {
    @FXML private ListView<String> modeListView;

    @FXML private TableView<Student> attendanceTable;
    @FXML private TableColumn<Object, Object> statusCol;
    @FXML private TableColumn<Object, Object> studentIDCol;
    @FXML private TableColumn<Object, Object> lastNameCol;
    @FXML private TableColumn<Object, Object> firstNameCol;
    @FXML private TableColumn<Object, Object> dateCol;

    private static List<Student> allStudents;

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

                    statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
                    studentIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
                    firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                    lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                    dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

                    ObservableList<Student> studentsData;

                    if (!allStudents.isEmpty()) {
                        studentsData = FXCollections.observableList(allStudents);
                    } else {
                        studentsData = FXCollections.observableList(
                                Collections.singletonList(new Student(false, -1, "null", "null", LocalDate.now())));
                    }

                    attendanceTable.setItems(studentsData);
                    attendanceTable.getStylesheets().add(Objects.requireNonNull(getClass().
                            getResource("styles/attendance_table.css")).toExternalForm());

                    attendanceTable.getSelectionModel().selectedItemProperty().addListener(observable1 -> {
                        Student selectedStudent = attendanceTable.getSelectionModel().getSelectedItem();

                        if (attendanceTable.isPressed()) {
                            System.out.println(selectedStudent);
                        }
                    });
                }

                case 1 -> {
                    System.out.println("test");
                }
            }
        });
    }

    private void fetchAllStudents() {
        allStudents = REST_FETCH.getAllData();
    }
}