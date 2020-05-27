package org.ReportIt.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXTools {
    private static Scene scene;
    public static void changeView(ActionEvent e, Class c, String viewName) {
        Stage mStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        try {
            scene = new Scene(FXMLLoader.load(c.getResource(String.format("/org/ReportIt/views/%s.fxml", viewName))));
    //      mStage.setScene(new Scene(FXMLLoader.load(c.getResource(String.format("/org/ReportIt/views/%s.fxml", viewName)))));
            mStage.setScene(scene);
            scene.getWindow().centerOnScreen();
            mStage.show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void changeViewMobile(ActionEvent e, Class c, String viewName) {
        Stage mStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        try {
            scene = new Scene(FXMLLoader.load(c.getResource(String.format("/org/ReportIt/views/Mobile/%s.fxml", viewName))));
            //      mStage.setScene(new Scene(FXMLLoader.load(c.getResource(String.format("/org/ReportIt/views/%s.fxml", viewName)))));
            mStage.setScene(scene);
            scene.getWindow().centerOnScreen();
            mStage.show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
