package org.ReportIt.Controllers.Mobile;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.ReportIt.ListOfProblems;
import org.ReportIt.Problem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable{
    @FXML
    private VBox boxProblem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadConversationsSamples();
    }

    private void loadConversationsSamples() {
        for(int i = 0; i < ListOfProblems.getListSize(); i++) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                Pane pane = fxmlLoader.load(getClass().getResource("/org/ReportIt/views/cards/mobile-problem.fxml"));
                MobileProblemController controller = (MobileProblemController) fxmlLoader.getController();
                Problem problem = ListOfProblems.getProblem(i);

                boxProblem.getChildren().add(pane);
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}
