/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author AsusPC
 */
public class AdminMenuController implements Initializable {

    @FXML
    private Button btnDataDosen;
    @FXML
    private Button btnDataMahasiswa;
    @FXML
    private Label labelMenuAdmin;

    /**
     * Initializes the controller class.
     */
    private ObservableList<String> languages;

    public ObservableList<String> getLanguages() {
        if (languages == null) {
            languages = FXCollections.observableArrayList();
            languages.add("English");
            languages.add("Indonesia");
        }
        return languages;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void btnDataDosenOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDataMahasiswaOnAction(ActionEvent event) {
    }

}
