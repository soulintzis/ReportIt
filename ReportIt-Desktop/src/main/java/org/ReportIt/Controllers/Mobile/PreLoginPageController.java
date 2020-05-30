package org.ReportIt.Controllers.Mobile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static org.ReportIt.utils.FXTools.changeView;
import static org.ReportIt.utils.FXTools.changeViewMobile;
public class PreLoginPageController {

    @FXML
    private Button con_cit_btn;

    @FXML
    private Button con_emp_btn;

    @FXML
    private Button guest_btn;

    @FXML
    void citizen_app(ActionEvent event) {
        changeViewMobile(event, getClass(), "Login");
    }

    @FXML
    void citizen_app_without_login(ActionEvent event) {
        changeViewMobile(event, getClass(), "Menu");
    }

    @FXML
    void employee_app(ActionEvent event) {
        changeView(event, getClass(), "Login");
    }

}
