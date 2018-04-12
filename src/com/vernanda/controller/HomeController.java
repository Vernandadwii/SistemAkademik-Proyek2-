/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
