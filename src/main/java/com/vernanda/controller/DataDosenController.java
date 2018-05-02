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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author AsusPC
 */
public class DataDosenController implements Initializable {

    @FXML
    private Label labelDataDosen;
    @FXML
    private Label labelNama;
    @FXML
    private TextField txtNama;
    @FXML
    private Label labelPass;
    @FXML
    private PasswordField txtPass;
    @FXML
    private Label labelFak;
    @FXML
    private ComboBox<?> cmbFak;
    @FXML
    private Label labelJur;
    @FXML
    private ComboBox<?> cmbJur;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    @FXML
    private TableColumn<?, ?> colNIK;
    @FXML
    private TableColumn<?, ?> colNama;
    @FXML
    private TableColumn<?, ?> colPass;
    @FXML
    private TableColumn<?, ?> colFak;
    @FXML
    private TableColumn<?, ?> colJur;

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
    private void btnUpdateOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDeleteOnAction(ActionEvent event) {
    }

}
