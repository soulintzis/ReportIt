package org.ReportIt.Controllers.Mobile;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AddProblemController implements Initializable {
    @FXML
    private ComboBox<String> type;

    @FXML
    private ComboBox<String> danger_degree;

    ObservableList<String> types = FXCollections.observableArrayList(
        "Φωτεινός σηματοδότης εκτός λειτουργίας","Πρόβλημα στο οδόστρωμα/πεζοδρόμιο","Διαρροή σωλήνα παροχής νερού","Άλλο"
    );

    ObservableList<String> danger = FXCollections.observableArrayList(
            "Φωτεινός σηματοδότης εκτός λειτουργίας","Πρόβλημα στο οδόστρωμα/πεζοδρόμιο","Διαρροή σωλήνα παροχής νερού","Άλλο"
    );

//    FXCollections.observableArrayList(week_days);

    @Override
    public void initialize(URL url, ResourceBundle rb){
        type.setItems(types);
        danger_degree.setItems(danger);
    }


}
