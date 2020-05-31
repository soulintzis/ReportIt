package org.ReportIt.Controllers.Mobile;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MobileProblemController {
    @FXML
    public Label setLocation;

    public void setSetLocation(String location) {
        setLocation.setText(location);
    }
}
