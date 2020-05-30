package org.ReportIt.Controllers.Desktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static org.ReportIt.utils.FXTools.changeView;

public class LoginController {

    @FXML
    private Button login_btn;

    @FXML
    void onLogin(ActionEvent e) {
        changeView(e, getClass(), "Sidebar");
    }

}
