package org.ReportIt.Controllers.Mobile;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AddProblemController implements Initializable {
    @FXML
    private ComboBox<String> combobox;

    ObservableList<String> list = FXCollections.observableArrayList(
        "Φωτεινός σηματοδότης εκτός λειτουργίας","Πρόβλημα στο οδόστρωμα/πεζοδρόμιο","Διαρροή σωλήνα παροχής νερού","Άλλο"
    );
//    FXCollections.observableArrayList(week_days);

    @Override
    public void initialize(URL url, ResourceBundle rb){
        combobox.setItems(list);
    }


}
