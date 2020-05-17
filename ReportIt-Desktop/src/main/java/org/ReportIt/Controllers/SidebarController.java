package org.ReportIt.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class SidebarController {

    @FXML
    private BorderPane structure;

    @FXML
    private Label username_label;

    @FXML
    private Button problem_btn;

    @FXML
    private Button map_btn;

    @FXML
    private Button profile_btn;

    @FXML
    private Button add_emp_btn;

    @FXML
    private Button logout_btn;

    @FXML
    void home(MouseEvent event) {
        loadScene("Home");
    }

    @FXML
    void map(MouseEvent event) {

    }

    @FXML
    void profile(MouseEvent event) {

    }

    @FXML
    void register(MouseEvent event) {

    }

    private void loadScene(String scene) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("/org/ReportIt/views/" + scene + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        structure.setCenter(root);
    }

}
