package com.louie.oodp_rest.settings;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ProjectSettings {
    private static ProjectSettings instance;
    private static Stage stage;
    private final Parent root;


    public ProjectSettings() {
        try {
            this.root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/louie/oodp_rest/HomePage.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setStage(Stage stage) {
        ProjectSettings.stage = stage;
    }

    public static ProjectSettings getInstance() {
        if (ProjectSettings.instance == null)
            ProjectSettings.instance = new ProjectSettings();

        return ProjectSettings.instance;
    }

    public Parent getRoot() {
        return root;
    }

    public static Stage getStage() {
        return ProjectSettings.stage;
    }
}
