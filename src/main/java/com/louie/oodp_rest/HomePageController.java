package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
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

    private static List<SectionSearchStudent> sectionSearchStudent;
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
//                case 0 -> {
//                    fetchAllStudents();
//
//                    statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
//                    studentIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
//                    firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
//                    lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
//                    dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
//
//                    ObservableList<Student> studentsData;
//
//                    if (!section.isEmpty()) {
//                        studentsData = FXCollections.observableList(section);
//                    } else {
//                        studentsData = FXCollections.observableList(
//                                Collections.singletonList(new Student(false, -1, "null", "null", LocalDate.now())));
//                    }
//
//                    attendanceTable.setItems(studentsData);
//                    attendanceTable.getStylesheets().add(Objects.requireNonNull(getClass().
//                            getResource("styles/attendance_table.css")).toExternalForm());
//
//                    attendanceTable.getSelectionModel().selectedItemProperty().addListener(observable1 -> {
//                        Student selectedStudent = attendanceTable.getSelectionModel().getSelectedItem();
//
//                        if (attendanceTable.isPressed()) {
//                            HomePageController.foundStudent = selectedStudent;
//                            showStudentTab();
//                        }
//                    });
//                }

                case 1 -> {
                    showSearchTab();
                }
            }
        });
    }

    private void fetchAllStudents() {
//        section = REST_FETCH.getAllData();

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