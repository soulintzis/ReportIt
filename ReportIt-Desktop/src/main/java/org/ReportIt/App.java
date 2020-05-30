package org.ReportIt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("views/PreLoginPage"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        System.out.println(App.class);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
//        launch(); 
        Problem problem1 = ListOfProblems.addProblem("Swmerset 103", "streetLight", "Medium", "Just another problem");
        Problem problem2 = ListOfProblems.addProblem("Swmerset 102", "streetLight", "Medium", "Just another problem");

        ListOfProblems.deleteProblem(problem1);
        ListOfProblems.printProblems();
    }


}
