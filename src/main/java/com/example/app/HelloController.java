package com.example.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label messageLabel;

    @FXML
    protected void onClickButton(ActionEvent event) {
        messageLabel.setText("Hello, Jenkins + JavaFX!");
    }
}
