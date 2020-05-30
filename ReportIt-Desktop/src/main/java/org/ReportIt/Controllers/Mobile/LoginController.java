package org.ReportIt.Controllers.Mobile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static org.ReportIt.utils.FXTools.changeViewMobile;

public class LoginController {

    @FXML
    private Button login_btn;

    @FXML
    void onLogin(ActionEvent event) {
        changeViewMobile(event, getClass(), "Menu");
    }

}