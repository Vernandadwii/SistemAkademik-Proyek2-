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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author AsusPC
 */
public class HomeController implements Initializable {

    @FXML
    private Button btnDataDosen;
    @FXML
    private Button btnDataMahasiswa;
    @FXML
    private Button btnDataMatkul;
    @FXML
    private Button btnDKBS;
    @FXML
    private Button btnMatkulPerSem;
    @FXML
    private Label labelSistemAkademik;
    @FXML
    private ComboBox<String> cmbLanguage;

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
        this.setComponenOutputText(rb);
        cmbLanguage.setItems(getLanguages());
        cmbLanguage.setPromptText("Indonesia");
    }

    @FXML
    private void btnDataDosenOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDataMahasiswaOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDataMatkulOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDKBSOnAction(ActionEvent event) {
    }

    @FXML
    private void btnMatkulPerSemOnAction(ActionEvent event) {
    }

    @FXML
    private void cmbLanguageOnAction(ActionEvent event) {
        if (cmbLanguage.getValue().equalsIgnoreCase("English")) {
            setComponenOutputText(ResourceBundle.getBundle("bundle/indonesia"));
        } else if (cmbLanguage.getValue().equalsIgnoreCase("Indonesia")) {
            setComponenOutputText(ResourceBundle.getBundle("bundle/indonesia"));
        }
    }

    private void setComponenOutputText(ResourceBundle rb) {
        labelSistemAkademik.setText(rb.getString("labelSistemAkademik"));
        btnDataDosen.setText(rb.getString("btnDataDosen"));
        btnDataMahasiswa.setText(rb.getString("btnDataMahasiswa"));
        btnDataMatkul.setText(rb.getString("btnDataMatakuliah"));
        btnDKBS.setText(rb.getString("btnDKBS"));
        btnMatkulPerSem.setText(rb.getString("btnMatkulPerSem"));
    }

}
