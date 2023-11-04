package com.louie.oodp_rest;

import com.louie.oodp_rest.adapter.REST_FETCH;
import com.louie.oodp_rest.data_class.Student;
import com.louie.oodp_rest.settings.ProjectSettings;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class AttendanceChecker extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = ProjectSettings.getInstance().getRoot();
        ProjectSettings.setStage(stage);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Attendance Checker");
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        ProjectSettings.getInstance();

        System.out.println(REST_FETCH.getStudent().getFirstName());

        List<Student> allStudents = REST_FETCH.getAllData();

        assert allStudents != null;
        for (Student x: allStudents) {
            System.out.println(x.getLastName());
        }

        AttendanceChecker.launch(args);
    }
}