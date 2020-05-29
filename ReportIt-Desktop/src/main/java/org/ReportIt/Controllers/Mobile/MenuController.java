package org.ReportIt.Controllers.Mobile;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
//    @FXML
//    private BorderPane main_window;

    @FXML
    private JFXHamburger menu_btn;

    @FXML
    private JFXDrawer drawer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            VBox vbox = FXMLLoader.load(getClass().getResource("/org/ReportIt/views/Mobile/Sidepanel.fxml"));
            drawer.setSidePane(vbox);
            Button previous_btn_pressed;
            VBox buttons_vbox = (VBox) vbox.getChildren().get(1);
            for (Node outernode : buttons_vbox.getChildren()) {
                HBox hBox = (HBox) outernode;
                for (Node node : hBox.getChildren()) {
                    node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                        if (node.getAccessibleText() != null) {
                            switch (node.getAccessibleText()) {
                                case "home":
                                    System.out.println("sa");
                                    break;
                                case "add":

                                    System.out.println("sa");
                                    break;
                                case "map":
                                    System.out.println("Hello");
                                    break;
                                case "profile":
                                    System.out.println("sa");
                                    break;
                            }
                        }
                    });
                }
            }
            Pane pane = (Pane) vbox.getChildren().get(2);
            HBox hbox2 = (HBox) pane.getChildren().get(0);
            Button logout_btn = (Button) hbox2.getChildren().get(1);
            for (Node node : hbox2.getChildren()) {
                node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    if (node.getAccessibleText() != null) {
                        System.out.println(node.getAccessibleText());
                        if (node.getAccessibleText().equals("exit")) {
                            //TODO: End user session
                            System.exit(0);
                        }
                    }
                });
            }
            HamburgerBasicCloseTransition transition = new HamburgerBasicCloseTransition(menu_btn);

            transition.setRate(-1);
            menu_btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                transition.setRate(transition.getRate() * -1);
                transition.play();

                if (drawer.isOpened()) {
                    drawer.close();
                } else {
                    drawer.open();
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

//    private void loadScene(String scene) {
//        Parent root = null;
//
//        try {
//            root = FXMLLoader.load(getClass().getResource("/org/ReportIt/views/Mobile/" + scene + ".fxml"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        main_window.setCenter(root);
//    }
}
