/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author AsusPC
 */
public class MatkulDibukaPerSemesterController implements Initializable {

    @FXML
    private TableColumn<?, ?> colKode1;
    @FXML
    private TableColumn<?, ?> colMatkul1;
    @FXML
    private TableColumn<?, ?> colSKS1;
    @FXML
    private TableColumn<?, ?> colWaktu1;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnRemove;
    @FXML
    private Button btnSubmit;
    @FXML
    private TableColumn<?, ?> colKode2;
    @FXML
    private TableColumn<?, ?> colMatkul2;
    @FXML
    private TableColumn<?, ?> colSKS2;
    @FXML
    private TableColumn<?, ?> colWaktu2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnSaveOnAction(ActionEvent event) {
    }

    @FXML
    private void btnSubmitOnAction(ActionEvent event) {
    }

}
