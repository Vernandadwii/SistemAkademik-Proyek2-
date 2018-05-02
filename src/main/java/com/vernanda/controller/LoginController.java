/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.controller;

import com.vernanda.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AsusPC
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Label labelLogin;
    @FXML
    private Label labelUsername;
    @FXML
    private Label labelPass;
    @FXML
    private Button btnLogin;
    @FXML
    private ImageView imgLogo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        imgLogo.setImage(new Image("imagesMarnat.jpg"));

    }

    @FXML
    private void btnLoginOnAction(ActionEvent event) {
        if (!TextUtil.isEmptyField(txtNrpNik, txtPassword)) {
            if (TextUtil.isNumber(txtNrpNik.getText().trim())) {
                System.out.println(txtNrpNik.getText().trim());
                System.out.println(TextUtil.SHAHash(txtPassword.getText()));
                try {
                    Stage secondStage = new Stage();
                    secondStage.setTitle("Integrated Academic System");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource(
                            "/view/StudentMainLayout.fxml"));
                    loader.setResources(rb);
                    BorderPane pane = loader.load();
                    Scene scene = new Scene(pane);
                    secondStage.setScene(scene);
                    secondStage.initOwner(anchorPane.getScene().getWindow());
                    secondStage.initModality(Modality.WINDOW_MODAL);
                    //                    anchorPane.getScene().getWindow().hide();
                    secondStage.show();
                } catch (IOException ex) {
                    Logger.getLogger(LoginLayoutController.class.getName()).
                            log(Level.SEVERE, null, ex);
                }
            } else {
                ViewUtil.showAlert(Alert.AlertType.ERROR, rb.getString(
                        "loginAlert.head"),
                        rb.getString("loginAlert.content"));
            }
        } else {
            ViewUtil.showAlert(Alert.AlertType.ERROR, rb.getString(
                    "incompleteAlert.head"),
                    rb.getString("incompleteAlert.content"));
        }
    }

}
